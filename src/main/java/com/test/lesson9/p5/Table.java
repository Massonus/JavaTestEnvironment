package com.test.lesson9.p5;

public class Table {

    private int id;

    private String name;

    static int count;

    public Table(int id, String name) {
        this.id = id;
        this.name = name;
        count ++;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
