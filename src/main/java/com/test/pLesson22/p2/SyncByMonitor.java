package com.test.pLesson22.p2;

public class SyncByMonitor {
    public static void main(String[] args) {
        Object chair1 = new Object();
        Object chair2 = new Object();

        Thread person1 = new Thread(() -> {
            System.out.println("person1 stand near chair1");
            synchronized ((chair1)){
                System.out.println("person1 sit down on chair1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("person1 stand up from chair1");
            }
        });
        person1.start();

        Thread person2 = new Thread(() -> {
            System.out.println("person2 stand near chair1");
            synchronized ((chair1)){
                System.out.println("person2 sit down on chair1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("person2 stand up from chair1");
            }
        });
        person2.start();

        Thread person3 = new Thread(() -> {
            System.out.println("person3 stand near chair1");
            synchronized ((chair1)){
                System.out.println("person3 sit down on chair1");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("person3 stand up from chair1");
            }
        });
        person3.start();

        Thread person4 = new Thread(() -> {
            System.out.println("person4 stand near chair2");
            synchronized ((chair2)){
                System.out.println("person4 sit down on chair2");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("person4 stand up from chair2");
            }
        });
        person4.start();


    }


}
