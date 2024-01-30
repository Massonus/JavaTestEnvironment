package com.test.lesson9.p3;

public class MultiDimensional {
    public static void main(String[] args) {
        int[][][] numbers = new int[3][][];

        int some_variable = 2;  //how many rows
        int some_variable2 = 4;     //how many columns

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = new int[some_variable][];

            for (int j = 0; j < some_variable; j++){
                numbers[i][j] = new int[some_variable2];

                for (int k = 0; k < some_variable2; k++){
                    numbers[i][j][k] = i + j + k;
                    System.out.print(" " + numbers[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
