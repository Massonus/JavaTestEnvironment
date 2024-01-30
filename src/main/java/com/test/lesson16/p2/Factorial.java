package com.test.lesson16.p2;

import java.math.BigInteger;

public class Factorial {

    public BigInteger solution(String number) throws NumberFormatException{

        int value = Integer.parseInt(number);

        if (value < 0)
            throw new ArithmeticException("Number must be non negative");

        BigInteger result = BigInteger.ONE;

        if (value == 0 || value == 1)
            return BigInteger.ONE;

        for (int i = 2; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        try {
            System.out.println(factorial.solution("-1g"));
        }catch (NumberFormatException e){
            System.out.println("Incorrect input value");
        }


    }

}
