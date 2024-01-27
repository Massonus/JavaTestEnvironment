package org.test.lesson2.p4;

public class Relational {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        boolean c = a < b;  //c = false
        c = a > b;  //true

        c = a == b;  //false
        c = a != b;  //true
        c = a >= b; //true
        c = a <= b; //false

        int number1 = 5;

        int number2 = 20;

        boolean isBigger = number1 < number2;

        System.out.println(isBigger);

        int number3 = 10;
        number3 += 15;

      /*  number3 ++;
        number3 --;

        System.out.println(number3);*/

       /* System.out.println(number3);*/

        int number5 = 30;
        int number6 = 30;

        boolean isBool = number5 == number6;

        int number7 = 15;
        int number8 = 30;


        boolean isBool1 = number7 > number8;

        if (isBool && isBool1 && false) {
            System.out.println("Hello");
        }

        String str = number7 > number8 ? "yes" : "no";

        System.out.println(str);

        int sec = 40;
        int hv  = 20;
        int god  = 30;

        int result = sec * hv * god;

        int radius = 10;

        double result1 = Math.PI * radius * Math.pow(10, 2);

        System.out.println(result1);

        int number9 = 15;
        int number10 = 30;

        boolean d1 = number10 < number9;

        number10 = number9;

        boolean d2 =  number10 > number9;


        int cost = 5000;
        int price = 7000;

        String win = price > cost ? "yes" : "no";
        System.out.println("result " + win);

        double res = (price + cost)/2;
        System.out.println("my cost " + res);
    }

}
