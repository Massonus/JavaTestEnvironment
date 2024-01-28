package org.test.TestTask57;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.test.TestTask57.entity.Course;
import org.test.TestTask57.service.CourseService;
import org.test.TestTask57.service.LectureService;

public class Main {

    public static void main(String[] args) {

        final ApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
        final CourseService courseService = context.getBean(CourseService.class);
        final LectureService lectureService = context.getBean(LectureService.class);

        for (int i = 0; i < 4; i++) {
            Course elementAuto = courseService.createElementAuto();
            System.out.println(elementAuto);
        }

        lectureService.getAllTeachers().forEach(System.out::println);
    }
}
