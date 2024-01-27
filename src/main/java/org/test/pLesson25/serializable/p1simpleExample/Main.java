package org.test.pLesson25.serializable.p1simpleExample;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("com/java4/main/src/lesson24/serializable/p1simpleExample/file1.txt");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            for (int i = 0; i < 30; i++) {
                CellPhone cellPhone = new CellPhone(i, "A5" + i);
                out.writeInt(0);
                out.writeObject(cellPhone);
            }

            while (in.available() > 0) {
                in.readInt();
                System.out.println(in.readObject());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
