package com.test.lesson13.p1;

public class NewStringObject {
    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = new String();
        string1 = string2;

        System.out.println("string - " + string1);


//        String string2 = new String();
        System.out.println("string2 - " + string2);


        char[] chars1 = {'а', 'b', 'с', 'd'};
        String string3 = new String(chars1);
        System.out.println("string3 - " + string3);


        char[] chars2 = {'a', 'b', 'с', 'd', 'e', 'f'};
        String string4 = new String(chars2, 2, 3);
        System.out.println("string4 - " + string4);


        byte[] bytes = {65, 66, 67, 68, 69, 70};
        String string5 = new String(bytes);
        System.out.println("string5 - " + string5);


        String string6 = new String(bytes, 2, 3);
        System.out.println(string6);
        System.out.println("string6 - " + string6);


        String string7 = string6;
        System.out.println("string7 == string6 =  " + string7);


        System.out.println("string7 length = " + string7.length());
        System.out.println("string7".length());

    }
}
