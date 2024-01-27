package org.test.lesson15.p4;

public class Worker extends Person implements AboutPerson, AboutWorker {
    @Override
    public String getId() {
        return "workerID";
    }

    @Override
    public String getName() {
        return "workerName";
    }

    @Override
    public void sayHello() {
        System.out.println("Hi I worker");
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
    public void about() {
        System.out.println("I am a worker");
    }


}
