package org.test.pLesson23.p4;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesMethods {

    public static List<Path> findByFileName(Path path, String fileName) throws IOException {
        List<Path> result;
        try (Stream<Path> pathStream = Files.find(path,
                Integer.MAX_VALUE,
                (p, basicFileAttributes) ->
                        p.getFileName().toString().equalsIgnoreCase(fileName))
        ) {
            result = pathStream.collect(Collectors.toList());
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Path tempFile = Files.createTempFile("test-file", ".txt");
        System.out.println("file: " + tempFile);

        Object attribute = Files.getAttribute(tempFile, "creationTime");
        System.out.println("creationTime - " + attribute);

        System.out.println("\n--------------- find file --------------------");
        Path path = Paths.get("com.study.examples");
        List<Path> result = findByFileName(path, "java.png");
        for (Path p : result) {
            System.out.println(p);
        }

        System.out.println("\n--------------- getFileAttributeView --------------------");
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(tempFile, BasicFileAttributeView.class);

        BasicFileAttributes basicFileAttributes = fileAttributeView.readAttributes();
        System.out.println("creationTime - " + basicFileAttributes.creationTime());

        System.out.println("\n--------------- getFileStore --------------------");
        FileStore fileStore = Files.getFileStore(tempFile);
        System.out.println("total space: " + fileStore.getTotalSpace());
        System.out.println("unallocated space: " + fileStore.getUnallocatedSpace());
        System.out.println("usable space: " + fileStore.getUsableSpace());
        System.out.println("store type: " + fileStore.type());

        System.out.println("\ngetOwner - " + Files.getOwner(tempFile));

        System.out.println("\n--------------- list --------------------");
        Files.list(Path.of("com.study.examples/")).forEach(a -> System.out.println(a));

        System.out.println("probeContentType - " + Files.probeContentType(Path.of("com.study.examples/src/lesson22/p4/java.png")));

        System.out.println("\n--------------- walk --------------------");
        Stream<Path> stream = Files.walk(path, 10, FileVisitOption.FOLLOW_LINKS);
        stream.limit(10).forEach(System.out::println);
    }
}
