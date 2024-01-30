package com.test.lesson21.p1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args)  {
        String text = "Hello world JAVA";
        byte[] bytes = text.getBytes();

        try(OutputStream os1 = new ByteArrayOutputStream()) {
            System.out.println("before write - " + os1);
            os1.write(bytes);
            System.out.println("after write - " + os1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
