package org.test.pLesson30.p2.m7_joining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining {
    public static void main(String[] args) {
        System.out.println("---------- joining() ----------");
        String s1 = Stream.of("a", "b", "c", "d")
                .collect(Collectors.joining());
        System.out.println(s1);

        System.out.println("---------- joining(CharSequence delimiter) ----------");
        String s2 = Stream.of("a", "b", "c", "d")
                .collect(Collectors.joining("-"));
        System.out.println(s2);

        System.out.println("---------- joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix) ----------");
        String s3 = Stream.of("a", "b", "c", "d")
                .collect(Collectors.joining(" -> ", "[ ", " ]"));
        System.out.println(s3);
    }
}
