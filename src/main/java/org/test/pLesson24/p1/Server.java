package org.test.pLesson24.p1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {

    public static void main(String[] args) {

        Server server = new Server();
        server.ReceiveObject();

    }

    private SocketChannel socketChannel = null;

    void ReceiveObject() {
        socketChannel = createChannel();
        try {
            ObjectInputStream is = new ObjectInputStream(socketChannel.socket().getInputStream());
            Student student = (Student) is.readObject();
            System.out.println("Object received: " + student);
            socketChannel.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private SocketChannel createChannel() {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress("localhost", 8080));
            System.out.println("Waiting for client...");
            socketChannel = serverSocketChannel.accept();
            System.out.println("Connect " + socketChannel.getRemoteAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socketChannel;
    }

}
