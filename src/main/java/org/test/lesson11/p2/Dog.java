package org.test.lesson11.p2;

public class Dog extends Animal {

    public Dog(int id, String name, String type) {
        super(id, name, type);
    }

    @Override
    public void say() {
        System.out.println(getName() + " " + "Gav");
    }

}
