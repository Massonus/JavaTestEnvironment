package org.test.pLesson23.p1;

public class Laptop {

    private String id;

    private String name;

    private String type;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Laptop(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
