package org.test.lesson8.p2;

public class Break {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            if (i == 5){
//                System.out.println(i);
//                break;
//            }
//        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5){
                    System.out.println("i - " + i + " j - " + j);
                    break;
                }
            }
        }


    }
}
