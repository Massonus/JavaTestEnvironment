package com.test.TestOnlineSchoolMVC.service;

import com.test.TestOnlineSchoolMVC.entity.Course;
import com.test.TestOnlineSchoolMVC.entity.Lecture;
import com.test.TestOnlineSchoolMVC.entity.Person;
import com.test.TestOnlineSchoolMVC.repo.CourseRepo;
import com.test.TestOnlineSchoolMVC.repo.LectureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CourseService {

    private final CourseRepo courseRepo;
    private final PersonService personService;
    private final LectureRepo lectureRepo;

    @Autowired
    public CourseService(CourseRepo courseRepo, PersonService personService, LectureRepo lectureRepo) {
        this.courseRepo = courseRepo;
        this.personService = personService;
        this.lectureRepo = lectureRepo;
    }

    Course course;

    public Course createElementAuto() {
        course = new Course();
        long id = courseRepo.findAll().size() + 1;

        if (id == 1) {
            course.setCourseName("First");
        }
        if (id == 2) {
            course.setCourseName("Second");
        }
        if (id == 3) {
            course.setCourseName("Third");
        }
        if (id == 4) {
            course.setCourseName("Fourth");
        }
        courseRepo.save(course);
        course.setPeople(createAndFillPeopleListListForCourse(course));

        List<Lecture> lecturesForCourse = lectureRepo.findAll().stream()
                .filter(l -> l.getId().equals(id))
                .collect(Collectors.toList());

        course.setLectures(lecturesForCourse);

        return course;
    }

    public void saveCourse(final Course course) {
        courseRepo.save(course);
    }

    public List<Course> getCourseList() {
        return courseRepo.findAll();
    }

    public Optional<Course> getCourseById(final long id) {
        return courseRepo.findById(id);
    }

    public List<Person> createAndFillPeopleListListForCourse(final Course course) {
        List<Person> materials = new ArrayList<>();
        Random random = new Random();
        int lengthMas = random.nextInt(1, 5);
        for (int i = 0; i < lengthMas; i++) {
            Person elementAuto = personService.createElementAuto(course);
            materials.add(elementAuto);
        }
        return materials;
    }

    public boolean serial(Course course) {
        final File file = new File("src/main/java/org/massonus/service/serialization.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(course);
            System.out.println("serial completed successfully \n" + course);
        } catch (IOException e) {
            Arrays.stream(e.getStackTrace()).forEach(System.out::println);
        }
        return true;
    }

    public Course deSer() {
        final File file = new File("src/main/java/org/massonus/service/serialization.txt");
        Course deSer = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            deSer = (Course) inputStream.readObject();
            System.out.println("deSer completed successfully ");
        } catch (IOException | ClassNotFoundException e) {
            Arrays.stream(e.getStackTrace()).forEach(System.out::println);
        }
        return deSer;
    }

    public List<Course> sortCoursesById(List<Course> courses) {
        return courses.stream()
                .sorted(Comparator.comparing(Course::getId))
                .collect(Collectors.toList());
    }
}

