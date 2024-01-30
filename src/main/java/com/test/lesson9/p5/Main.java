package com.test.lesson9.p5;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        TableRepo.createTablesMas(10);

        final Table[] tables = TableRepo.tables;

        tables[0] = new Table(1, "htest");
        tables[2] = new Table(31, "1test1");
        tables[4] = new Table(66, "gtest");

        System.out.println(TableRepo.tables[0]);


        Table table = new Table(21, "aTab1");
        Table table1 = new Table(11, "2Tab1");
        Table table2 = new Table(761, "jTab1");


        Table[] tables1 = {table, table1, table2};

        Arrays.sort(tables1);

        for (Table table3 : tables1) {
            System.out.println(table3);
        }


        Random random = new Random();

        random.nextInt(10, 100);


    }

}
