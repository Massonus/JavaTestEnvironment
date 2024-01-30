package com.test.pLesson35.p2.entity;

public class Cat extends Animal implements Sound {
    private int privateField;
    int defaultField;
    public int publicField;
    private final String type = "CAT";

    public Cat() {
    }

    private Cat(int privateField) {
        this.privateField = privateField;
    }

    public Cat(int privateField, int defaultField, int publicField) {
        this.privateField = privateField;
        this.defaultField = defaultField;
        this.publicField = publicField;
    }

    public void publicMethod(){
        System.out.println("publicMethod");
    }

    private void privateMethod(){
        System.out.println("privateMethod");
    }

    private void privateMethodWithParameter(String name){
        System.out.println(name);
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }

    public class Nested1 {

        public class Nested1ClasA {
        }

        public class Nested1ClasB {
        }
    }

    public class Nested2 {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "privateField=" + privateField +
                ", defaultField=" + defaultField +
                ", publicField=" + publicField +
                '}';
    }
}
