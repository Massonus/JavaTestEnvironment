package org.test.pLesson23.p3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ReadWriteByChannel {
    public static String readFromFile(File file) {
        try (FileInputStream fin = new FileInputStream(file);
             FileChannel channel = fin.getChannel()) {

            ByteBuffer buff = ByteBuffer.allocate(20);

            channel.read(buff);
            String fileContent = new String(buff.array(), StandardCharsets.UTF_8);

            return fileContent;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void writeToFile(File file) {
        try (RandomAccessFile writer = new RandomAccessFile(file, "rw");
             FileChannel channel = writer.getChannel()) {
            ByteBuffer buff = ByteBuffer.wrap("Java".getBytes(StandardCharsets.UTF_8));

            channel.write(buff);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        File file = new File("com.study.examples/src/lesson22/p3/text.txt");

        System.out.println("--------------- readFromFile --------------------");
        System.out.println(readFromFile(file));

        writeToFile(file);

        System.out.println("--------------- readFromFile after write --------------------");
        System.out.println(readFromFile(file));
    }
}
