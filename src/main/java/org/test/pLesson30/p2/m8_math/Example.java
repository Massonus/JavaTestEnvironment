package org.test.pLesson30.p2.m8_math;


import org.test.pLesson30.p2.entity.Employee;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Tom Jones", 45, 15000.00),
                new Employee("Tom Jones", 45, 7000.00),
                new Employee("Ethan Hardy", 65, 8000.00),
                new Employee("Nancy Smith", 22, 10000.00),
                new Employee("Deborah Sprightly", 29, 9000.00));

        String maxSalaryEmp = employeeList.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        (Optional<Employee> emp) -> emp.isPresent() ? emp.get().getName() : "none"));
        System.out.println("Max salaried employee's name: " + maxSalaryEmp);

        String avgSalary = employeeList.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.averagingDouble(Employee::getSalary),
                        averageSalary -> new DecimalFormat("'$'0.00").format(averageSalary)));
        System.out.println("Average salary in $: " + avgSalary);

        System.out.println("--- All SummaryStatistics ----");
        DoubleSummaryStatistics stats = employeeList.stream()
                .map(a -> String.valueOf(a.getSalary()))
                .collect(Collectors.summarizingDouble((Double::parseDouble)));

        System.out.println(stats);
    }
}
