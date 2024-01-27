package org.test.lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = new Student();
        student.name = "Student";
        student.id = "10";
        student.sayHello();

        Animal animalName = new Animal();
        animalName.name = "Animal";

        sayMayName();

        System.out.println("Alina");

        int firstNumber = 10;
        int secondNumber = 20;

        int sum = firstNumber + secondNumber;

        System.out.println("amount " + sum);

        saySum();

       // System.out.println("Hello Lisa");

    }

    public static void sayMayName () {
        System.out.println("Lisa");
    }

    public static void saySum () {
        int firstNumber = 10;
        int secondNumber = 20;

        int sum = firstNumber + secondNumber;

        System.out.println("amount " + sum);
    }

}