package org.test.TestTask57.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.TestTask57.entity.Course;
import org.test.TestTask57.entity.Lecture;
import org.test.TestTask57.entity.Person;
import org.test.TestTask57.repo.CourseRepoTest;
import org.test.TestTask57.repo.LectureRepoTest;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CourseService {

    private final CourseRepoTest courseRepo;
    private final PersonService personService;
    private final LectureRepoTest lectureRepo;

    @Autowired
    public CourseService(CourseRepoTest courseRepo, PersonService personService, LectureRepoTest lectureRepo) {
        this.courseRepo = courseRepo;
        this.personService = personService;
        this.lectureRepo = lectureRepo;
    }

    Course course;

    public Course createElementAuto() {
        course = new Course();
        long id = courseRepo.findAll().size() + 1;
        course.setId(id);

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

    public List<Person> createAndFillPeopleListListForCourse(final Course course) {
        List<Person> materials = new ArrayList<>();
        Random random = new Random();
        int lengthMas = random.nextInt(1, 9);
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

