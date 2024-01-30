package com.test.pLesson25.serializable.p1simpleExample;

import java.io.*;

public class MainWithOneFile {

    public static void main(String[] args) {
        File file = new File("com/java4/main/src/lesson24/serializable/p1simpleExample/file.txt");
        CellPhone cellPhone = new CellPhone(2000, "A5");
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
    }

}
