package com.test.lesson14.p3;

public class UtilsStudent {

    Student student;

    String id;

    public <T, S> UtilsStudent(Student student, T id, S value) {
        this.student = student;
        this.id = id.toString();
        System.out.println(value);
    }

    public void printStudent(final Student student) {
        System.out.println(student);
    }


    public <T> void printEn(T value) {
        System.out.println(value);
    }

}
