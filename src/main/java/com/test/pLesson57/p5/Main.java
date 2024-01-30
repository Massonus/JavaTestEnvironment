package com.test.pLesson57.p5;

public class Main {

    public static void main(String[] args) {

        PieUtils pieUtils = new PieUtils();

        Pie pie = new Pie();
        pie.setName("Pie1");
        pie.getEmails().add("test");
        pie.getEmails().add("test2");

        pieUtils.savePie(pie);
    }

}
