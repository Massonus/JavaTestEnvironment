package org.test.TestTask57.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.TestTask57.entity.Course;
import org.test.TestTask57.entity.Lecture;
import org.test.TestTask57.entity.Person;
import org.test.TestTask57.entity.Role;
import org.test.TestTask57.repo.PersonRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Service
public class PersonService {

    private final PersonRepo personRepo = new PersonRepo();

    private final LectureService lectureService;

    @Autowired
    public PersonService(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    Person person;

    public Person createElementAuto(final Course course) {
        person = new Person();
        Random random = new Random();
        int id = random.nextInt(1, 50);
        person.setId(id);

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
        personRepo.addPerson(person);
        person.setLectures(createAndFillLecturesForPerson(course, person));

        return person;
    }

    public String generateRandomString() {
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public List<Lecture> createAndFillLecturesForPerson(final Course course, final Person person) {
        List<Lecture> materials = new ArrayList<>();
        Random random = new Random();
        int lengthMas = random.nextInt(1, 6);
        for (int i = 0; i < lengthMas; i++) {
            Lecture elementAuto = lectureService.createElementAuto(course, person);
            materials.add(elementAuto);
        }
        return materials;
    }

    public Person getById(List<Person> list, int id) {

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
