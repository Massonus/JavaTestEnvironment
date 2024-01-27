package org.test.TestTask57;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.test.TestTask57.entity.Course;
import org.test.TestTask57.repo.*;
import org.test.TestTask57.service.*;

public class Main {

    public static void main(String[] args) {

        final ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        AdditionalMaterialRepo materialRepo = context.getBean(AdditionalMaterialRepo.class);
        AdditionalMaterialService materialService = context.getBean(AdditionalMaterialService.class);


        CourseRepo courseRepo = context.getBean(CourseRepo.class);
        CourseService courseService = context.getBean(CourseService.class);


        HomeworkRepo homeworkRepo = context.getBean(HomeworkRepo.class);
        HomeworkService homeworkService = context.getBean(HomeworkService.class);


        LectureRepo lectureRepo = context.getBean(LectureRepo.class);
        LectureService lectureService = context.getBean(LectureService.class);


        PersonRepo personRepo = context.getBean(PersonRepo.class);
        PersonService personService = context.getBean(PersonService.class);


        for (int i = 0; i < 4; i++) {
            Course elementAuto = courseService.createElementAuto();
            System.out.println(elementAuto);
        }

        lectureService.getAllTeachers().forEach(System.out::println);

    }
}
