package org.test.pLesson26.p3.function;

import java.util.function.Function;

public class QuadraticEquation {

    public static void main(String[] args) {

        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);

        Integer result1 = addThenMultiply.apply(3);
        System.out.println(result1);







//        if (D > 0) {
//            double x1, x2;
//            x1 = (-b - Math.sqrt(D)) / (2 * a);
//            x2 = (-b + Math.sqrt(D)) / (2 * a);
//            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
//        } else if (D == 0) {
//            double x;
//            x = -b / (2 * a);
//            System.out.println("Уравнение имеет единственный корень: x = " + x);
//        } else {
//            System.out.println("Уравнение не имеет действительных корней!");
//        }

    }
}
