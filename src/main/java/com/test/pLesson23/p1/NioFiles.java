package com.test.pLesson23.p1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFiles {

    public static void main(String[] args) {
        createFile("com/java4/main/src/lesson22/p1/big.data");
    }

    public static void createFile(final String path) {
        try {
            final Path p = Paths.get(path);

            if (Files.exists(p)) {
                System.out.println("File already exists");
            } else {
                final Path done = Files.createFile(p);
                System.out.println("File created: " + done);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
