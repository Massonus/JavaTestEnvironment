package org.test.lesson15.p4;

public class Boss extends Person implements AboutPerson {
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hi I boss");
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printId() {
        super.printId();
    }
}
