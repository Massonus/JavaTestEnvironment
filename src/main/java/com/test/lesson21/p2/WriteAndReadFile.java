package com.test.lesson21.p2;

import java.io.*;

public class WriteAndReadFile {
    public static void main(String[] args) throws IOException {
        String text = "Hello Java";
        File file = new File("src/org.test.lesson21/p2", "program.txt");

        try (FileWriter fileWriter = new FileWriter(file);
             FileReader fileReader = new FileReader(file)) {

            fileWriter.write(text);

            int s;
            while ((s = fileReader.read()) != -1){
                System.out.print((char) s + " ");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
