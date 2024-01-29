package org.test.TestOnlineSchoolMVC.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.TestOnlineSchoolMVC.entity.Course;
import org.test.TestOnlineSchoolMVC.entity.Lecture;
import org.test.TestOnlineSchoolMVC.entity.Person;
import org.test.TestOnlineSchoolMVC.entity.Role;
import org.test.TestOnlineSchoolMVC.repo.CourseRepo;
import org.test.TestOnlineSchoolMVC.repo.LectureRepo;
import org.test.TestOnlineSchoolMVC.repo.PersonRepo;

import java.util.*;

@Service
public class PersonService {

    private final PersonRepo personRepo;
    private final LectureService lectureService;
    private final LectureRepo lectureRepo;
    private final CourseRepo courseRepo;

    @Autowired
    public PersonService(PersonRepo personRepo, LectureService lectureService, LectureRepo lectureRepo, CourseRepo courseRepo) {
        this.personRepo = personRepo;
        this.lectureService = lectureService;
        this.lectureRepo = lectureRepo;
        this.courseRepo = courseRepo;
    }

    Person person;

    public Person createElementByUser() {
        System.out.println("Then you must create the Person");
        person = new Person();

        System.out.println("Enter first name of the Person");
        Scanner scanner1 = new Scanner(System.in);
        person.setFirstName(scanner1.nextLine());

        System.out.println("Enter last name of the Person");
        Scanner scanner2 = new Scanner(System.in);
        person.setLastName(scanner2.nextLine());

        System.out.println("Enter phone of the Person");
        Scanner scanner3 = new Scanner(System.in);
        person.setPhone(scanner3.nextLine());

        System.out.println("Enter email of the Person");
        Scanner scanner4 = new Scanner(System.in);
        person.setEmail(scanner4.nextLine());

        System.out.println("1. To select the role Student");
        System.out.println("2. To select the role Teacher");
        Scanner scanner5 = new Scanner(System.in);
        int role = scanner5.nextInt();
        if (role == 1) {
            person.setRole(Role.STUDENT);
        } else if (role == 2) {
            person.setRole(Role.TEACHER);
        } else {
            System.out.println("Incorrect");
        }

        personRepo.save(person);

        List<Lecture> lectures = lecturesForPerson(person);
        person.setLectures(lectures);

        List<Course> courses = coursesForPerson(person);
        person.setCourses(courses);

        return person;
    }

    public Person createElementAuto(final Course course) {
        person = new Person();
        Random random = new Random();
        long id = random.nextInt(1, 50);

        if (id < 10 || id > 40) {
            person.setFirstName("John");
            person.setLastName("Smith");
            person.setPhone("Samsung");
            person.setRole(Role.TEACHER);
        } else if (id < 20 || id > 30) {
            person.setFirstName("Nick");
            person.setLastName("Nikolos");
            person.setPhone("Xiaomi");

            person.setRole(Role.STUDENT);
        } else {
            person.setFirstName("Max");
            person.setLastName("Collins");
            person.setPhone("iPhone");
            person.setRole(Role.TEACHER);
        }
        person.setEmail(generateRandomString() + "@gmail.com");

        person.getCourses().add(course);
        personRepo.save(person);
        person.setLectures(createAndFillLecturesForPerson(course, person));

        return person;
    }

    private List<Course> coursesForPerson(Person person) {
        List<Course> courses = new ArrayList<>();

        System.out.println("How many courses?");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("Choose courses: ");

        courseRepo.findAll().forEach(System.out::println);
        for (int i = 0; i < length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            Course courseById = courseRepo.findById(scanner1.nextLong()).get();
            courseById.getPeople().add(person);
            courseRepo.save(courseById);
            courses.add(courseById);
        }
        return courses;
    }

    private List<Lecture> lecturesForPerson(final Person person) {
        List<Lecture> lectures = new ArrayList<>();

        System.out.println("How many lectures?");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("Choose lectures: ");

        lectureRepo.findAll().forEach(System.out::println);

        for (int i = 0; i < length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            Lecture lectureById = lectureRepo.findById(scanner1.nextLong()).get();
            lectureById.setPerson(person);
            lectureRepo.save(lectureById);
            lectures.add(lectureById);
        }
        return lectures;
    }

    public String generateRandomString() {
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public void savePerson(final Person person) {
        personRepo.save(person);
    }

    public List<Person> getPeopleList() {
        return personRepo.findAll();
    }

    public Optional<Person> getPersonById(final long id) {
        return personRepo.findById(id);
    }

    public void deletePerson(final long id) {
        personRepo.deleteById(id);
    }

    public List<Lecture> createAndFillLecturesForPerson(final Course course, final Person person) {
        List<Lecture> materials = new ArrayList<>();
        Random random = new Random();
        int lengthMas = random.nextInt(1, 5);
        for (int i = 0; i < lengthMas; i++) {
            Lecture elementAuto = lectureService.createElementAuto(course, person);
            materials.add(elementAuto);
        }
        return materials;
    }

    public Person getById(List<Person> list, long id) {

        List<Person> collect = list.stream()
                .filter(p -> p.getId().equals(id))
                .toList();

        return collect.get(0);
    }

    private int lengthMasByUser() {
        System.out.println("Enter how many elements do you want");
        Scanner scanner1 = new Scanner(System.in);

        return scanner1.nextInt();
    }
}
