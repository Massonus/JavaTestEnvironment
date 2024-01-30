package com.test.TestOnlineSchoolMVC.service;

import com.test.TestOnlineSchoolMVC.entity.Course;
import com.test.TestOnlineSchoolMVC.entity.Lecture;
import com.test.TestOnlineSchoolMVC.entity.Person;
import com.test.TestOnlineSchoolMVC.entity.Role;
import com.test.TestOnlineSchoolMVC.repo.CourseRepo;
import com.test.TestOnlineSchoolMVC.repo.PersonRepo;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonService {

    private final PersonRepo personRepo;
    private final LectureService lectureService;
    private final CourseRepo courseRepo;

    @Autowired
    public PersonService(PersonRepo personRepo, LectureService lectureService, CourseRepo courseRepo) {
        this.personRepo = personRepo;
        this.lectureService = lectureService;
        this.courseRepo = courseRepo;
    }

    Person person;

    public Person createElementByUserForm(final String firstName, final String lastName, final String phone, final String email, Role role, final List<Integer> lectureIdList, final List<Integer> courseIdList) {
        person = new Person();

        person.setFirstName(firstName);

        person.setLastName(lastName);

        person.setPhone(phone);

        person.setEmail(email);

        person.setRole(role);

        personRepo.save(person);

        final List<Lecture> lectures = lecturesForPerson(person, lectureIdList);
        person.setLectures(lectures);

        final List<Course> courses = coursesForPerson(person, courseIdList);
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

    private List<Course> coursesForPerson(final Person person, final List<Integer> courseIdList) {
        List<Course> courses = new ArrayList<>();

        for (Integer id : courseIdList) {
            Course courseById = courseRepo.findById(id.longValue()).get();
            courseById.getPeople().add(person);
            courseRepo.save(courseById);
            courses.add(courseById);
        }
        return courses;
    }

    private List<Lecture> lecturesForPerson(final Person person, final List<Integer> lectureIdList) {
        List<Lecture> lectures = new ArrayList<>();

        for (Integer id : lectureIdList) {
            Lecture lectureById = lectureService.getLectureById(id).get();
            lectureById.setPerson(person);
            lectureService.saveLecture(lectureById);
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
