package com.test.pLesson23.p1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Append {

    public static void main(String[] args) {
     /*   try {
            final Path p = Paths.get("com.study.examples/src/lesson22/p1/append.txt");

            final String content = "\nPlus CAT";

            *//* Files.write(p, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);*//*
            Files.write(p, content.getBytes(), StandardOpenOption.APPEND);

            System.out.println("Append");

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        final List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("1", "Dell", "PC"));
        laptopList.add(new Laptop("2", "Sony", "LP"));
        laptopList.add(new Laptop("3", "NO", "D"));

            /*appendInfo("com/java4/main/src/lesson22/p1/append.txt", "Lisa");*/
        appendInfoWithCollection("com/java4/main/src/lesson22/p1/append.txt", laptopList);

    }

    public static void appendInfo(final String path, final String value) {
        try {

            final Path p = Paths.get(path);

            if (!Files.exists(p)) {
                throw new IllegalStateException();
            }
            for (int i = 0; i < 10; i++) {
                Files.write(p, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
                Files.write(p, value.getBytes(), StandardOpenOption.APPEND);
            }

            System.out.println("added " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendInfoWithCollection(final String path, final List<Laptop> laptopList) {
        try {
            final Path p = Paths.get(path);

            if (!Files.exists(p)) {
                throw new IllegalStateException();
            }

            for (Laptop li : laptopList) {
                Files.write(p, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
                Files.write(p, li.getName().getBytes(), StandardOpenOption.APPEND);
                final String date = " " + new Date();
                Files.write(p, date.getBytes(), StandardOpenOption.APPEND);
            }

            System.out.println("added " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
