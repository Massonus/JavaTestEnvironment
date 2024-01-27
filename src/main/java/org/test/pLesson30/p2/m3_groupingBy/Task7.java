package org.test.pLesson30.p2.m3_groupingBy;


import org.test.pLesson30.p2.entity.Speciality;
import org.test.pLesson30.p2.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Task7 {
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
        Map<Speciality, Map<Integer, List<Student>>> result5 = students.stream()
                .sorted(Comparator
                        .comparing(Student::getSpeciality, Comparator.comparing(Enum::name))
                        .thenComparing(Student::getYear)
                )
                .collect(Collectors.groupingBy(
                        Student::getSpeciality,
                        LinkedHashMap::new,
                        Collectors.groupingBy(Student::getYear)));

        result5.forEach((s, map) -> {
            System.out.println("-= " + s + " =-");
            map.forEach((year, list) -> System.out.format("%d: %s%n", year, list.stream()
                    .map(Student::getName)
                    .sorted()
                    .collect(Collectors.joining(", ")))
            );
            System.out.println();
        });
    }
}
