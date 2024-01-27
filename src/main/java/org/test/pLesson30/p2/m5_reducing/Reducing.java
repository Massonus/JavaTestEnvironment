package org.test.pLesson30.p2.m5_reducing;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        System.out.println("----- reducing  ------");
        Integer reducingData = numbers.stream()
                .collect(Collectors.reducing(0, (a, b) -> a + b));
        System.out.println(reducingData);

        System.out.println("---------- reducing() ----------");
        String s3 = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.reducing(
                        "", x -> Integer.toString(x), (a, b) -> a + b
                ));
        System.out.println(s3);
    }
}
