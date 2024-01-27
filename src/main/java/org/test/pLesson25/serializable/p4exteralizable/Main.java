package org.test.pLesson25.serializable.p4exteralizable;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("com/java4/main/src/lesson24/serializable/p4exteralizable/file.txt");
        CellPhone cellPhone = new CellPhone(1, "A5");
        CellPhone.age = 10;
        CellPhone deserial;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            out.writeObject(cellPhone);

            deserial = (CellPhone) in.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(deserial);
    }
}
