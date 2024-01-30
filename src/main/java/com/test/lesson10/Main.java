package com.test.lesson10;

public class Main {

    public static void main(String[] args) {
        /*randomMet();

        MobileUtils mobileUtils7 = new MobileUtils();

        Mobile test = new Mobile();

        MobileUtils test1 = new MobileUtils();

        MobileUtils test2 = new MobileUtils();

        getRandom(getNewInt());*/

        Mobile mobile1 = new Mobile();
        mobile1.setBattery(new Battery());
        mobile1.setId(1);
        mobile1.setName("F");

        Mobile mobile2 = new Mobile();
        mobile2.setBattery(new Battery());
        mobile2.setId(2);
        mobile2.setName("A");

        System.out.println(mobile1);
        System.out.println(mobile2);

        Mobile.count = 1;

        System.out.println(mobile2.count);
        System.out.println(mobile1.count);

        System.out.println(getNewInt());

        final int newInt = getNewInt();

    }

    private static int getRandom (final int random) {
        return random;
    }
    private static int getNewInt() {
        int a = 20;
        return a;
    }

    private static void randomMet() {
        int [] array = {10, 11, 12};

        final Mobile bil = new Mobile();

        final Battery battery = bil.getBattery();

        Mobile mobile = new Mobile();

        Mobile mobile1 = new Mobile();

        Mobile mobileUtils = new Mobile();
    }

}
