package com.test.pLesson25.cloneable.deep.usingSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(1);
        Account account = new Account(1, "1000", group);
        Account accountCopy;

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);

            outputStream.writeObject(account);
            outputStream.flush();
            outputStream.close();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);

            accountCopy = (Account) inputStream.readObject();

            inputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main object - " + account);
        System.out.println("clone object - " + accountCopy);
        accountCopy.setBalance("10000");
        accountCopy.getGroup().setId(20);
        System.out.println("main object after set - " + account);
        System.out.println("clone object after set- " + accountCopy);
    }
}
