package org.test.lesson2.p4;

public class Bitwise {
    public static void main(String[] args) {
        byte a = 3;
        byte b = 5;

        System.out.println(a & b);  //0000 0011 &
//        // 0000 0101 =
//        // 0000 0001     result = 1
//        System.out.println(a | b);  //0000 0011 &
//        // 0000 0101 =
//        // 0000 0111     result = 7
//        System.out.println(a ^ b);  //0000 0011 &
//        // 0000 0101 =
//        // 0000 0110     result = 6
//        System.out.println(~a);  //~ 0000 0011 =
//        // 1111 1100      result = -4

//        System.out.println(4 >> 1);     //0100 >> 1 = 0010 = 2
//        System.out.println(3 << 1);     //0011 << 1 = 0110 = 6

//        int i1 = 4;
//        //0100
//        int i2 = i1 >>> 2;
//        //0001
//        System.out.println(i2);

//        int i3 = 56;
//        int i4 = 3;
//        i3 >>= i4; //i3 = i3 >> i4
//        i3 <<= i4; //i3 = i3 << i4
//        System.out.println(i3 >>= i4);
//        System.out.println(i3 <<= i4);

        int pin = 1234;
        int maska = 35;

        int codedPin = pin ^ maska;
        int receivedPin = codedPin ^ maska;
        boolean check = pin == receivedPin;

        System.out.println("pin = " + pin);
        System.out.println("codedPin = " + codedPin);
        System.out.println("receivedPin = " + receivedPin);
        System.out.print("pin and receivedPin equals - ");
        System.out.print(check ? "yes" : "no");




    }


}
