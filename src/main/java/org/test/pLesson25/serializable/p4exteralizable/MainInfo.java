package org.test.pLesson25.serializable.p4exteralizable;

import java.io.*;

public class MainInfo {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Ivan", "Ivanov", "Petro passport data");

        try (FileOutputStream fileOutputStream = new FileOutputStream("com/java4/main/src/lesson24/serializable/p4exteralizable/save.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
             FileInputStream fileInputStream = new FileInputStream("com/java4/main/src/lesson24/serializable/p4exteralizable/save.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            objectOutputStream.writeObject(userInfo);
            UserInfo userInfoDes = (UserInfo) objectInputStream.readObject();
            System.out.println(userInfoDes);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
