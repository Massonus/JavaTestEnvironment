package org.test.lesson11.p2;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(1, "animal", "animal1");

        Cat cat = new Cat(2, "cat", "cat1", "Smith");

        Dog dog = new Dog(3, "dog", "dog1");

        System.out.println(animal);
        animal.say();
        System.out.println(cat);
        cat.say();
        System.out.println(dog);
        dog.say();

    }

}
