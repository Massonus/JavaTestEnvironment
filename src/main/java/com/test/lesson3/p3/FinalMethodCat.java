package com.test.lesson3.p3;

public class FinalMethodCat {
    public final void meow(){
        System.out.println("Cat is meowing a lot");
    }
}

class Dog extends FinalMethodCat {

//    public final void meow(){
//        System.out.println("Dog is meowing a lot");
//    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.meow();
    }
}