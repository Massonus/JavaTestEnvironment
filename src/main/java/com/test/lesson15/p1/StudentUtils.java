package com.test.lesson15.p1;

public class StudentUtils {

    public void getRealName(final Student student) {
        System.out.println(getNameFromStudent(student));
    }

    private String getNameFromStudent(final Student student) {
        if (isName(student.getName())) {
            return "Elisabet";
        }
        return "Noname";
    }

    private boolean isName(final String studentName) {
        return studentName.equals("Lisa");
    }


}
