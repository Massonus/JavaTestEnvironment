package com.test.pLesson57.p4;

public class Main {

    public static void main(String[] args) {

        ManyUtils manyUtils = new ManyUtils();

        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        CourseTest course = new CourseTest();
        CourseTest course1 = new CourseTest();
        CourseTest course2 = new CourseTest();

        manyUtils.saveCourse(course);
        manyUtils.saveCourse(course1);
        manyUtils.saveCourse(course2);

        student.setName("One");
        student.getCourses().add(course);
        student.getCourses().add(course1);

        student1.setName("Two");
        student1.getCourses().add(course1);
        student1.getCourses().add(course2);

        student2.setName("T");
        student2.getCourses().add(course2);

        manyUtils.saveStudent(student);
        manyUtils.saveStudent(student1);
        manyUtils.saveStudent(student2);

    }

}
