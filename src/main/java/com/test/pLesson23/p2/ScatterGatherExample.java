package com.test.pLesson23.p2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class ScatterGatherExample {
    public static void gatherBytes(String data) {
        ByteBuffer buffer1 = ByteBuffer.allocate(8);
        ByteBuffer buffer2 = ByteBuffer.allocate(400);

        buffer1.asIntBuffer().put(420);
        buffer2.asCharBuffer().put(data);


        GatheringByteChannel gatherer = createChannelInstance("com.study.examples/src/lesson22/p2/test.txt", true);

        try {
            gatherer.write(new ByteBuffer[]{buffer1, buffer2});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void scatterBytes() {
        ByteBuffer buffer1 = ByteBuffer.allocate(8);
        ByteBuffer buffer2 = ByteBuffer.allocate(400);

        ScatteringByteChannel scatter = createChannelInstance("com.study.examples/src/lesson22/p2/test.txt", false);

        try {
            scatter.read(new ByteBuffer[]{buffer1, buffer2});
        } catch (Exception e) {
            e.printStackTrace();
        }

        buffer1.rewind();
        buffer2.rewind();

        int bufferOne = buffer1.asIntBuffer().get();
        String bufferTwo = buffer2.asCharBuffer().toString();

        System.out.println(bufferOne);
        System.out.println(bufferTwo);
    }

    public static FileChannel createChannelInstance(String file, boolean isOutput) {
        FileChannel channel = null;
        try {
            if (isOutput) {
                channel = new FileOutputStream(file).getChannel();
            } else {
                channel = new FileInputStream(file).getChannel();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return channel;
    }

    public static void main(String[] args) throws IOException {
        String data = "Scattering and Gathering example";
        gatherBytes(data);
        scatterBytes();
    }
}

