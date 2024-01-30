package com.test.lesson9.p5;

public class Main1 {

    public static void main(String[] args) {

        Main.main(new String[]{"1", "2", "3", "4", "5"});

       /* System.out.println(TableRepo.tables[0]);

        TableRepo.createTablesMas(20);

        System.out.println(TableRepo.tables[0]);

        Table table = new Table(2, "Name");

        TableRepo.add(table, 0);

        System.out.println(TableRepo.tables[0]);*/

        final Table[] tables = TableRepo.tables;

        for (Table table1 : tables) {
            System.out.println(table1);
        }






    }

}
