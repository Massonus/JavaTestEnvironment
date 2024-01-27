package org.test.lesson15.p4;

public class Main {

    public static void main(String[] args) {
        Person person = new Boss();
        person.sayHello();

        Person worker  = new Worker();
        worker.sayHello();

        AboutPerson aboutPerson = new Worker();
        aboutPerson.say();

        Worker worker1  = new Worker();
        worker1.say();

        AboutWorker aboutWorker = new Worker();
        aboutWorker.about();

        AboutWorker.hello();
    }
}
