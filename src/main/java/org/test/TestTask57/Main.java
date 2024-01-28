package org.test.TestTask57;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.test.TestTask57.entity.AdditionalMaterial;
import org.test.TestTask57.entity.Course;
import org.test.TestTask57.repo.*;
import org.test.TestTask57.service.*;

public class Main {

    public static void main(String[] args) {

        final ApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        AdditionalMaterialService materialService = context.getBean(AdditionalMaterialService.class);
        AdditionalMaterial elementAuto = materialService.createElementAuto();
        materialService.saveMaterial(elementAuto);



        /*for (int i = 0; i < 4; i++) {
            Course elementAuto = courseService.createElementAuto();
            System.out.println(elementAuto);
        }

        lectureService.getAllTeachers().forEach(System.out::println);
*/
    }
}
