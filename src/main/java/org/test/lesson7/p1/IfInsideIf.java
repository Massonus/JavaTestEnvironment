package org.test.lesson7.p1;

public class IfInsideIf {
    public static void main(String[] args) {
        int x = 15;
        int y = 1;

        if(x > 4){
            System.out.println("x greater then 4");
            if (x < 20) System.out.println("but less then 20");
        }

//        if (x > y){
//            if (y == 0){
//                x *= y;
//            }else {
//                System.out.println("y not equals 0");
//                if (y == 1){
//                    System.out.println("y equal 1");
//                }else {
//                    System.out.println("y greater then 1");
//                }
//            }
//        }else {
//            System.out.println("x less then y");
//        }




    }


}
