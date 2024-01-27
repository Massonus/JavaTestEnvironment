package org.test.lesson9.p5;

public class TableRepo {

    public static Table[] tables;

    public static void createTablesMas(final int length) {
        if (tables != null && tables.length > 0) {
            return;
        }
        tables = new Table[length];
    }

    public static void add(Table table, int index) {
        if (tables != null && tables.length > index) {
            if (tables[index] != null) {
                System.out.println("Exist");
                return;
            }
            tables[index] = table;
        } else {
            System.out.println("Error");
        }
    }

}
