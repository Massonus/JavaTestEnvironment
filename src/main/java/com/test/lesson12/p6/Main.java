package com.test.lesson12.p6;

public class Main {

    public static void main(String[] args) {

        final int id = 0;

        final String name = "X";

        final PhoneTypes phoneTypes = PhoneTypes.ANDROID;

        final Phone phone = new Phone(id, name, phoneTypes);

        final PhoneUtils phoneUtils = new PhoneUtils();

      /*  phoneUtils.printPhone(phone);*/

        /*phoneUtils.addPhone(phone, 0);*/

      /*  phoneUtils.addPhoneWithSw(phone, 0);

        System.out.println(PhoneRepo.androidPhones[0]);*/

        phoneUtils.setUp();

    }

}
