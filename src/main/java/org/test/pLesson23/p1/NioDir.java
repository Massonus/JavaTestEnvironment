package org.test.pLesson23.p1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDir {

    public static void main(String[] args) {
        createDir("com/java4/main/src/lesson22/p6");
    }

    public static void createDir(final String path) {

        try {
            final Path p = Paths.get(path);
            if (Files.exists(p)) {
                System.out.println("This dir exists: " + p);
            } else {
                final Path done = Files.createDirectory(p);
                System.out.println("Dir created: " + done);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
