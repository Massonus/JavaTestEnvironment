package org.test.pLesson23.p2;

import java.nio.ByteBuffer;

public class BufferMethods {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        String text = "Hello";

        System.out.println("-----------------allocate()----------------");
        System.out.println("position: " + byteBuffer.position());
        System.out.println("limit: " + byteBuffer.limit());
        System.out.println("capacity: " + byteBuffer.capacity());

        byteBuffer.put(text.getBytes());

        System.out.println("-----------------put(\"Hello\")----------------");
        System.out.println("position: " + byteBuffer.position());
        System.out.println("limit: " + byteBuffer.limit());
        System.out.println("capacity: " + byteBuffer.capacity());

        byteBuffer.flip();

        System.out.println("-----------------flip()----------------");
        System.out.println("position: " + byteBuffer.position());
        System.out.println("limit: " + byteBuffer.limit());
        System.out.println("capacity: " + byteBuffer.capacity());

        byte[] dst = new byte[byteBuffer.limit()];
        byteBuffer.get(dst);
        String getRead = new String(dst, 0, dst.length);

        System.out.println("-----------------get() - " + getRead + " ----------------");
        System.out.println("position: " + byteBuffer.position());
        System.out.println("limit: " + byteBuffer.limit());
        System.out.println("capacity: " + byteBuffer.capacity());

        byteBuffer.rewind();

        dst = new byte[byteBuffer.limit()];
        byteBuffer.get(dst);
        getRead = new String(dst, 0, dst.length);

        System.out.println("-----------------rewind() - " + getRead + " ----------------");
        System.out.println("position: " + byteBuffer.position());
        System.out.println("limit: " + byteBuffer.limit());
        System.out.println("capacity: " + byteBuffer.capacity());

        byteBuffer.clear();

        System.out.println("-----------------clear()----------------");
        System.out.println("position: " + byteBuffer.position());
        System.out.println("limit: " + byteBuffer.limit());
        System.out.println("capacity: " + byteBuffer.capacity());

        dst = new byte[byteBuffer.limit()];
        byteBuffer.get(dst);
        getRead = new String(dst, 0, dst.length);
        System.out.println("After clear buffer - " + getRead);
    }
}
