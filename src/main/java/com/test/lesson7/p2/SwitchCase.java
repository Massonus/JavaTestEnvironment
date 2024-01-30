package com.test.lesson7.p2;

public class SwitchCase {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int result = 0;

        char sign = '+';

        switch (sign){
            case '-':
                result = x - y;
                break;
            case '+':
                result = x + y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Incorrect symbol");
        }

        System.out.println(result);

    }
}
