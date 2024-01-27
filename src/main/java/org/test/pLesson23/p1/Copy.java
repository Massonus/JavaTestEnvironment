package org.test.pLesson23.p1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class Copy {

    public static void main(String[] args) {
        copyOf("com/java4/main/src/lesson22/p1/ex.txt", "com/java4/main/src/lesson22/p1/ex56.txt");
       /* copyOf("com.study.examples/src/lesson22/p1/ex.txt", "com.study.examples/src/lesson22/p5/ex.txt");*/
    }

    public static void copyOf(final String pathFrom, final String pathTo) {
        try {
            System.out.println("Stated " + new Date());
            final Path pathFrom1 = Paths.get(pathFrom);
            final Path pathTo1 = Paths.get(pathTo);

            Files.copy(pathFrom1, pathTo1);

            System.out.println("Done " + new Date());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
