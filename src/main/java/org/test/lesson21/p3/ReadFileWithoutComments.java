package org.test.lesson21.p3;

import java.io.*;

public class ReadFileWithoutComments {
    public static void main(String[] args) {

        try (Reader reader = new BufferedReader(new FileReader("src/org.test.lesson21/p3/file.txt"));
             PushbackReader pushbackReader = new PushbackReader(reader)) {

            StringBuilder newText = new StringBuilder();
            boolean inComment = false;

            int ch;
            while ((ch = pushbackReader.read()) != -1) {
                if (inComment) {
                    if (ch == '\n') {
                        newText.append((char) ch);
                        inComment = false;
                    }
                } else {
                    if (ch == '-') {
                        int nextChar = pushbackReader.read();
                        if (nextChar == -1 || nextChar != '-') {
                            newText.append((char) ch);
                            pushbackReader.unread(nextChar);
                        } else {
                            inComment = true;
                        }
                    } else {
                        newText.append((char) ch);
                    }
                }
            }
            System.out.println(newText);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
