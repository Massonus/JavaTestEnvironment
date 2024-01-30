package com.test.pLesson30.p2.m6_filteringResult;


import com.test.pLesson30.p2.entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {
        System.out.println("---------- mapping() ----------");
        String s1 = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.filtering(
                        x -> x % 2 == 0,
                        Collectors.mapping(x -> Integer.toString(x),
                                Collectors.joining("-")
                        )
                ));

        System.out.println(s1);


        List<Employee> employeeList
                = Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
                new Employee("Harry Andrews", 45, 7000.00),
                new Employee("Ethan Hardy", 65, 8000.00),
                new Employee("Nancy Smith", 22, 10000.00),
                new Employee("Deborah Sprightly", 29, 9000.00));

        List<String> employeeNames = employeeList
                .stream()
                .collect(Collectors.mapping(Employee::getName, Collectors.toList()));
        System.out.println("List of employee names:" + employeeNames);


        Optional<Integer> maxAge = employeeList
                .stream()
                .collect(Collectors.mapping((Employee emp) -> emp.getAge(), Collectors.maxBy(Integer::compareTo)));
        System.out.println("Max Age: " + maxAge.get());
    }
}
