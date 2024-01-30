package com.test.lesson21.p3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsoleAndWriteToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/org.test.lesson21/p3", "console.txt");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            String text;
            System.out.println("Enter text to write in file. 'q' to exit");
            while (!(text = br.readLine()).equals("q")) {

                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
