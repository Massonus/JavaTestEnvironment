package com.test.TestOnlineSchoolJPA;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

/*

    @Scope("singleton")
    @Bean
    public AdditionalMaterialRepo materialRepo() {
        return new AdditionalMaterialRepo();
    }

    @Scope("singleton")
    @Bean
    public CourseRepo courseRepo() {
        return new CourseRepo();
    }

    @Scope("singleton")
    @Bean
    public HomeworkRepo homeworkRepo() {
        return new HomeworkRepo();
    }

    @Scope("singleton")
    @Bean
    public PersonRepo personRepo() {
        return new PersonRepo();
    }

    @Scope("singleton")
    @Bean
    public LectureRepo lectureRepo() {
        return new LectureRepo();
    }

    @Scope("singleton")
    @Bean
    public AdditionalMaterialService materialService() {
        return new AdditionalMaterialService(materialRepo());
    }

    @Scope("singleton")
    @Bean
    public LectureService lectureService() {
        return new LectureService(lectureRepo(), materialService(), materialRepo(), homeworkService(), homeworkRepo(), personRepo());
    }

    @Scope("singleton")
    @Bean
    public PersonService personService() {
        return new PersonService(lectureService());
    }

    @Scope("singleton")
    @Bean
    public CourseService courseService() {
        return new CourseService(courseRepo(), personService(), lectureRepo());
    }

    @Scope("singleton")
    @Bean
    public HomeworkService homeworkService() {
        return new HomeworkService(homeworkRepo());
    }
*/

}
