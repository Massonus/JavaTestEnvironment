package org.test.pLesson25.serializable.p2withComposition;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("com/java4/main/src/lesson24/serializable/p2withComposition/file.txt");
        CellPhone cellPhone = new CellPhone(2000, "A5", new Battery(1500));
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

        System.out.println("main -" + cellPhone);
        System.out.println("deserialize - " + deserial);
        System.out.println("--------------------------------");
        deserial.getBattery().setPower(20000);
        System.out.println("main after -" + cellPhone);
        System.out.println("deserialize after set - " + deserial);

    }
}
