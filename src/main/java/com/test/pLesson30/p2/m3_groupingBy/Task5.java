package com.test.pLesson30.p2.m3_groupingBy;


import com.test.pLesson30.p2.entity.Speciality;
import com.test.pLesson30.p2.entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", Speciality.ComputerScience, 1),
                new Student("Rika", Speciality.Biology, 4),
                new Student("Julia", Speciality.Biology, 2),
                new Student("Steve", Speciality.History, 4),
                new Student("Mike", Speciality.Biology, 1),
                new Student("Hinata", Speciality.Biology, 2),
                new Student("Richard", Speciality.History, 1),
                new Student("Kate", Speciality.ComputerScience, 2),
                new Student("Sergey", Speciality.ComputerScience, 4),
                new Student("Maximilian", Speciality.ComputerScience, 3),
                new Student("Tim", Speciality.History, 4),
                new Student("Ann", Speciality.Biology, 1)
        );

        Map<Object, Long> result = students.stream()
                .collect(Collectors.groupingBy(
                        a -> a.getSpeciality(), Collectors.counting()));
        result.entrySet().forEach(System.out::println);
    }
}
