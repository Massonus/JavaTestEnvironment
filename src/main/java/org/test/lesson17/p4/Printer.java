package org.test.lesson17.p4;

public class Printer {

    private int id;

    private String name;

    public Printer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
