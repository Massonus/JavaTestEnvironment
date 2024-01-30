package com.test.pLesson26.p3.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {
    public static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        Map<String, Integer> map = convertListToMap(list, x -> x.length());

        System.out.println(map);
    }




}
