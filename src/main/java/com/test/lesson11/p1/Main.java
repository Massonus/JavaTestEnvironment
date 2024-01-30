package com.test.lesson11.p1;

public class Main {

    public static void main(String[] args) {
        HeadphonesUtils headphonesUtils = new HeadphonesUtils();

        Headphones headphones = new Headphones();
        headphones.setName("Name1");
    /*    headphones.setType("Type3");*/
        headphones.setId(0);

        System.out.println(headphones.getType());

       /* headphonesUtils.printHeadphones(headphones);*/
    }

}
