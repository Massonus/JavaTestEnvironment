package com.test.pLesson26.p2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21)
        );

        System.out.println("Before sort:");
        for (User user : users) {
            System.out.println(user);
        }

        Comparator<User> comparator = Comparator.comparingInt(User::getAge);
        users.sort(comparator.reversed());

        System.out.println("\nAfter sort:");
        for (User user : users) {
            System.out.println(user);
        }

    }
}
