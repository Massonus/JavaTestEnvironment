package com.test.lesson17.p3;

public class Main {

    public static void main(String[] args) {

        int number1 = 10;

        int number2 = 20;

        final Integer integer = Integer.valueOf(10);

        int number3 = integer;


        System.out.println(number3);

        final boolean s = number1 == number2;

        final Integer[] numbers = new Integer[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        Utils<Integer> utils = new Utils(numbers);
        final Integer value = utils.getValue(1);
        utils.print(value);

        Integer integer1 = Integer.valueOf(100);

        final int intValue = utils.getIntValue(integer1);
        System.out.println(intValue);


        Double doubleValue1 = 20.9D;

        Integer integer3 = (int) doubleValue1.doubleValue();

        double doubleValue = 20.9D;

        int a = (int) doubleValue;

        Boolean booleanValue = Boolean.valueOf(true);

        boolean bs = booleanValue;

        final boolean bool = utils.getBool(null);
        System.out.println(bool);

    }

}
