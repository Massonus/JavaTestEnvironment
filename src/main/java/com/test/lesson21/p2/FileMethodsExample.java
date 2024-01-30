package com.test.lesson21.p2;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.time.Instant;

public class FileMethodsExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/org.test.lesson21/p2", "program.txt");
        file.createNewFile();

        System.out.println("canExecute? - " + file.canExecute());
        System.out.println("canRead? - " + file.canRead());
        System.out.println("canWrite? - " + file.canWrite());
        System.out.println("exists? - " + file.exists());
        System.out.println();
        System.out.println("getFreeSpace - " + file.getFreeSpace() / 100_000 + " Gb");
        System.out.println("getName - " + file.getName());
        System.out.println("getParent - " + file.getParent());
        System.out.println("getPath - " + file.getPath());
        System.out.println("getAbsolutePath - " + file.getAbsolutePath());
        System.out.println();
        System.out.println("isAbsolute? - " + file.isAbsolute());
        System.out.println("isDirectory? - " + file.isDirectory());
        System.out.println("isFile? - " + file.isFile());
        System.out.println("length - " + file.length());
        System.out.println();
        //
        System.out.println("lastModified default (after 1970) - " + file.lastModified());

        System.out.println("lastModified in datetime - " + Instant.ofEpochMilli(file.lastModified()));

        System.out.println();
        System.out.println("Files in catalog");
        File catalog = new File(file.getParent());
        String[] allFiles = catalog.list();
        for (String s : allFiles) {
            System.out.println(s);
        }

        System.out.println("\nUse filter filename endWith 'java'");
        String[] filterFiles = catalog.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("java");
            }
        });

        for (String s : filterFiles) {
            System.out.println(s);
        }

        System.out.print("Roots in OS: ");
        File[] listRoots = File.listRoots();
        for (File listRoot : listRoots) {
            System.out.print(listRoot + " ");
        }

    }
}
