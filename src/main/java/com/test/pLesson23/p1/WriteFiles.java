package com.test.pLesson23.p1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFiles {

    public static void main(String[] args) {

        /*try {
            final Path p = Paths.get("com.study.examples/src/lesson22/p1/dog.txt");

            final Path done = Files.createFile(p);

            final String content = "Hello cat";

            Files.write(p, content.getBytes());
            System.out.println("Date written");

            final Path p1 = Paths.get("com.study.examples/src/lesson22/p1/dog1.txt");
            final Path done1 = Files.createFile(p1);

            final Path p2 = Paths.get("com.study.examples/src/lesson22/p1/ex.txt");
            final List<String> stringList = Files.readAllLines(p2);

            Files.write(p1, stringList);

            System.out.println("Date written");

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*write("com.study.examples/src/lesson22/p1/dog.txt", "Hello world");*/

        writeFRom("com/java4/main/src/lesson22/p1/dog.txt", "com/java4/main/src/lesson22/p1/dog76.txt");
    }

    public static void writeFRom(final String pathFrom, final String pathTo) {
        try {
            final Path p1 = Paths.get(pathTo);

            if (!Files.exists(p1)) {
                Files.createFile(p1);
            }

            final Path p2 = Paths.get(pathFrom);
            final List<String> strings = Files.readAllLines(p2);

            Files.write(p1, strings);

            System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(final String path, final String cont) {
        try {
            final Path p1 = Paths.get(path);
            Files.createFile(p1);

            Files.write(p1, cont.getBytes());

            System.out.println("Written done " + cont);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
