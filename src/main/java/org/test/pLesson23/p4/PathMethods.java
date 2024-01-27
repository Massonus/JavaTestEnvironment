package org.test.pLesson23.p4;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;

public class PathMethods {
    public static void main(String[] args) {
        Path javaImg = Path.of("com.study.examples/src/lesson22/p4/java.png");
        System.out.println("main path - " + javaImg);

        System.out.println("\n--------------- iterator --------------------");
        Iterator iterator = javaImg.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n--------------- methods --------------------");
        System.out.println("isAbsolute - " + javaImg.isAbsolute());
        System.out.println("toAbsolutePath - " + javaImg.toAbsolutePath());

        System.out.println("getFileName - " + javaImg.getFileName());
        System.out.println("getParent - " + javaImg.getParent());
        System.out.println("subpath index 2-4 - " + javaImg.subpath(2, 4));
        System.out.println("getNameCount - " + javaImg.getNameCount());
        System.out.println("getName index '3' - " + javaImg.getName(3));
        System.out.println("getFileSystem - " + javaImg.getFileSystem());
        System.out.println("getRoot - " + javaImg.getRoot());
        System.out.println("endsWith 'java.png' ? - " + javaImg.endsWith("java.png"));
        System.out.println("endsWith 'p4/java.png' ? - " + javaImg.endsWith(Path.of("lesson37/java.png")));
        System.out.println("startsWith 'src' ? - " + javaImg.startsWith("src"));

        System.out.println("relativize - " + javaImg.relativize(Path.of("com.study.examples/lesson22")));
        System.out.println("resolve - " + javaImg.resolve("com.study.examples/java/"));
        System.out.println("resolveSibling - " + javaImg.resolveSibling("com.study.examples/lesson22"));

        try {
            System.out.println("toRealPath - " + javaImg.toRealPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
