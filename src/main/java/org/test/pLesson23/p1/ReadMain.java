package org.test.pLesson23.p1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadMain {

    public static void main(String[] args) {

       /* try {
            final Path p = Paths.get("com.study.examples/src/lesson22/p1/cat.txt");
            final List<String> stringList = Files.readAllLines(p);
            for (String s : stringList) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        readText("com/java4/main/src/lesson22/p1/cat.txt");
    }

    public static void readText(final String path) {
        try {
            final Path p = Paths.get(path);
            final List<String> strings = Files.readAllLines(p);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getText(final String path) {
        try {
            final Path p = Paths.get(path);
            final List<String> strings = Files.readAllLines(p);
            return strings;
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException();
    }

}
