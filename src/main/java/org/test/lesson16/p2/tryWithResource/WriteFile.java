package org.test.lesson16.p2.tryWithResource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Write some text:");

            writer.write(scanner.nextLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

}
