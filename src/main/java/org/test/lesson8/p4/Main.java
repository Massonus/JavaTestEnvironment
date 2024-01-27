package org.test.lesson8.p4;

public class Main {

    public static void main(String[] args) {

        Course course = new Course();
        Course course1 = new Course();

        Lecture lecture = new Lecture();

        course1.lecture = lecture;
        course.lecture = lecture;

        final String name = course.lecture.name;
        final int id = course.lecture.id;

    }

}
