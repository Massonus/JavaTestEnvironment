package com.test.pLesson35.p4.ex2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class testClass = Test.class;
        Method[] methods = testClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)){
                method.invoke(null);
            }
        }

        System.out.println("==============");

        List<Method> executionList = new ArrayList<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)){
                executionList.add(method);
            }
        }

        List<Method> list = Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(MyAnnotation.class))
                .sorted((o1, o2) ->
                        o2.getAnnotation(MyAnnotation.class).priority() -
                        o1.getAnnotation(MyAnnotation.class).priority())
                .collect(Collectors.toList());

        for (Method method : list) {
            System.out.println(method);
        }
  }
}
