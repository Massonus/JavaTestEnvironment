package com.test.pLesson24.p1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

public class Client {
    private boolean isConnected = false;

    private SocketChannel socketChannel;
    private ObjectOutputStream outputStream;

    public static void main(String[] args) {
        Client client = new Client();
        client.sendObject();
    }

    SocketChannel createChannel() {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(true);
            SocketAddress socketAddress = new InetSocketAddress("localhost", 8080);
            socketChannel.connect(socketAddress);
            return socketChannel;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    void sendObject() {
        while (!isConnected) {
            socketChannel = createChannel();
            isConnected = true;
            try {
                outputStream = new ObjectOutputStream(socketChannel.socket().getOutputStream());
                Student student = new Student(22, "Jon");
                outputStream.writeObject(student);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
