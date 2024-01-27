package org.test.lesson8.p1;

public class ForEach {

    double arithmeticMean(double... numbers) {
        double result = 0;

        for (double number : numbers) {
            result += number;
        }

        return result / numbers.length;
    }


    public static void main(String[] args) {
        ForEach forEach = new ForEach();

        double result = forEach.arithmeticMean(1, 2, 3, 4, 5);

        System.out.println("Arithmetic mean = " + result);
    }
}
