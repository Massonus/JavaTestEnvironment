package com.test.pLesson25.serializable.p3withExtendsAndTransient;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("com/java4/main/src/lesson24/serializable/p3withExtendsAndTransient/file.txt");
        CellPhone cellPhone = new CellPhone(2023, 2000, "A5", new Battery(1500));
        Phone deserial;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            out.writeObject(cellPhone);

            deserial = (Phone) in.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(deserial);
    }
}
