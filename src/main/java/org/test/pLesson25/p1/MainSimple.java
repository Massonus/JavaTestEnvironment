package org.test.pLesson25.p1;

import java.io.*;

public class MainSimple {

    public static void main(String[] args) {
        /*seral("com/java4/main/src/lesson24/p1/file.txt");*/
        deSer("com/java4/main/src/lesson24/p1/file.txt");
    }

    static void seral(final String path) {
        final File file = new File(path);
        final BigData bigData = new BigData(0, "Big", "Data", "s");
        bigData.setInfo("ThisInfo");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(bigData);
            System.out.println("serial completed successfully " + bigData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deSer(final String path) {
        final File file = new File(path);

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            final BigData deSer = (BigData) inputStream.readObject();
            System.out.println("deSer completed successfully " + deSer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
