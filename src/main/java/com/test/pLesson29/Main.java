package com.test.pLesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Repo repo = new Repo();

        final List<Tea> teaList = repo.getTeaList(15);

        final List<Company> collect = teaList.stream()
                .map(tea -> tea.getCompany())
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        teaList.stream()
                .map(tea -> {
                    final Company company = tea.getCompany();
                    if (company.getId() % 2 == 0) {
                        return company;
                    }
                    return new Company();
                }).forEach(System.out::println);

        teaList.stream()
                .filter(tea -> tea.getId() % 2 == 0)
                .map(Tea::getCompany)
                .forEach(System.out::println);

        final List<List<Tea>> listOfListTeas = repo.getListOfListTeas();

        listOfListTeas.stream()
                .flatMap(teaList1 -> teaList1.stream())
                .map(tea -> tea.getCompany())
                .forEach(System.out::println);

        listOfListTeas.stream()
                .flatMap(teas -> teas.stream()
                        .map(tea -> tea.getCompany()))
                .forEach(System.out::println);

        List<String> stringList = new ArrayList<>();

        List<Integer> integerList = new ArrayList<>();

        final List<Type> collect1 = teaList.stream()
                .peek(tea -> stringList.add(tea.getName()))
                .peek(tea -> integerList.add(tea.getId()))
                .map(tea -> tea.getType())
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);

        System.out.println("------------------------");

        collect.forEach(System.out::println);

        System.out.println("------------------------");

        integerList.forEach(System.out::println);

        List<Integer> integerList1 = new ArrayList<>();

        teaList.stream()
                .forEach(tea -> {
                    integerList.add(tea.getId());
                });

        System.out.println(integerList);

        final boolean present = teaList.stream()
                .filter(tea -> tea.getId() == 19)
                .findAny()
                .isPresent();

        final boolean b = teaList.stream()
                .anyMatch(tea -> tea.getId() == 19);

        final boolean b1 = teaList.stream()
                .noneMatch(tea -> tea.getId() == 19);

        final boolean b2 = teaList.stream()
                .allMatch(tea -> tea.getId() != -5);

        if (b2) {
            System.out.println("Done");
        } else {
            System.out.println("Error");
        }

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(4);

        final Integer integer = list.stream().reduce((a, c) -> a + c).get();
        System.out.println(integer);

        final long count = list.stream().count();
        System.out.println(count);

        final String s = teaList.stream().map(teA -> teA.getName()).reduce((a, c) -> a + c).get();
        System.out.println(s);

        List<Integer> numbers = Arrays.asList(5, 10, 2, 8, 6);

        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        final Integer min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow();

        System.out.println(integer);

        final long sum = teaList.stream().mapToLong(Tea::getId).sum();

        System.out.println(sum);

    }

}
