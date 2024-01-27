package org.test.pLesson24.p2;


import org.test.pLesson24.p1.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerSoc {

    public static void main(String[] args) {
        ServerSoc soc = new ServerSoc();
        soc.createServer();
    }

    void createServer() {
        try (ServerSocket serverSocket = new ServerSocket(57999);
             Socket socket = serverSocket.accept();
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            List<Student> students = new ArrayList<>();
            students.add(new Student(1, "jon"));
            students.add(new Student(2, "lisa"));
            students.add(new Student(3, "Petro"));

            writer.write("Hello");

            for (Student student : students) {
                writer.write(student.getName());
                writer.write(student.getAge());
            }

            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
