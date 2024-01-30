package com.test.lesson7.p2;

public class SwitchWithCaseManyValue {
    public static void main(String[] args) {
        int month = 2;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("incorrect month number");
        }

        switch (month) {
            case 12, 1, 2 -> System.out.println("winter");
            case 3, 4, 5 -> System.out.println("spring");
            case 6, 7, 8 -> System.out.println("summer");
            case 9, 10, 11 -> System.out.println("autumn");
            default -> System.out.println("incorrect month number");
        }
    }
}
