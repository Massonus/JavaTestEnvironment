package org.test.lesson21.p5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

    public boolean serial(final Mouse mouse) {
        File file = new File("com/java4/main/src/lesson21a/p5/mouse.data");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(mouse);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Mouse des() {
        File file = new File("com/java4/main/src/lesson21a/p5/mouse.data");

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (Mouse) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
