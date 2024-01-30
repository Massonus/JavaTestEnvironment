package com.test.pLesson30.p2.m6_filteringResult;


import com.test.pLesson30.p2.entity.Speciality;
import com.test.pLesson30.p2.entity.Student;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class CollectingAndThen {
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


        String longestName = students.stream()
                .collect(collectingAndThen(
                                mapping(Student::getName, toList()),
                                l -> l.stream()
                                        .collect(maxBy(comparing(String::length)
                                        ))
                                        .orElse("?")
                        )
                );
        System.out.println(longestName);
    }
}
