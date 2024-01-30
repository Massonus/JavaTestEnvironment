package com.test.lesson11.p1;

public class Headphones {

    private int id;

    private String name;

    private String type;

    public static String COUNT = "Count";

    Headphones(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Headphones(int id) {
        this.id = id;
    }

    public Headphones() {
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

    public String getType() {
        if (this.id == 0) {
            System.out.println("Error");
            return null;
        }
        return type;
    }

    public void setType(String type) {
        if  (type.equals("Type3")) {
            System.out.println("Wrong type");
            return;
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}