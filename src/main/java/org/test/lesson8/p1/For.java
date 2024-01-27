package org.test.lesson8.p1;

public class For {

    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }


//        boolean done = false;
//
//        for (int i = 0; !done; i++) {
//            System.out.println(i);
//            if (i == 6){
//                done = true;
//            }
//        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("i - " + i + " j - " + j);
            }
        }


    }
}
