package org.test.pLesson24.p3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final EchoClient start = EchoClient.start();
        start.sendMessage("cat");
        try {
            EchoClient.stop();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
