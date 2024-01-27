package org.test.pLesson24.p2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Soc {

    public static void main(String[] args) {
        Soc soc = new Soc();
        soc.createSoc();
    }

    void createSoc() {
        try (Socket socket = new Socket();
             Scanner scanner = new Scanner(socket.getInputStream())) {
            socket.connect(new InetSocketAddress("india.colorado.edu", 13), 2000);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
