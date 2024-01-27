package org.test.lesson11.p2;

public class Cat extends Animal {

    private String secondName;

    public Cat(int id, String name, String type, String secondName) {
        super(id, name, type);
        this.secondName = secondName;
    }

    @Override
    public void say() {
        System.out.println(secondName + " " + "Mew");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "secondName='" + secondName + '\'' +
                '}';
    }
}
