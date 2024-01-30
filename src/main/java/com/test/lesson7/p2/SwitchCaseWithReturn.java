package com.test.lesson7.p2;

public class SwitchCaseWithReturn {
    public static void main(String[] args) {
        double x = 10;
        double y = 3;

        char sign = '+';

//        double result = switch (sign) {
//            case '-':
//                yield x - y;
//            case '*':
//                yield x * y;
//            case '/':
//                yield x / y;
//            default:
//                yield x + y;
//        };

        double result = switch (sign) {
            case '-' -> x - y;
            case '+' -> x + y;
            case '*' -> x * y;
            case '/' -> x / y;
            default -> throw new IllegalArgumentException("Incorrect symbol");
        };

        System.out.println(result);


    }
}
