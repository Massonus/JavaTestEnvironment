package com.test.lesson15.p3;

public class Smartphone {

    private User usr;

    private Bat bat;


    public Smartphone(User usr, Bat bat) {
        this.usr = usr;
        this.bat = bat;
    }

    public Smartphone(Bat bat) {
        this.bat = bat;
    }

    public void print() {
        System.out.println(usr);
    }

    public void getB() {
        System.out.println(bat);
    }

}
