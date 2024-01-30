package com.test.lesson3.p3;

public class FinalData {
    private final double PI = 3.14;
    private double radius;

    public void circumference (){
//        PI = 4;
        System.out.println("Circumference = " + 2 * PI * this.radius);
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData();
//        finalData.PI = 10;
        finalData.radius = 1;
        finalData.circumference();
    }


}
