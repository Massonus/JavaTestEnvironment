package com.test.pLesson25.p1;

import java.io.Serializable;

public class BigData implements Serializable {

    private int id;

    private String name;

    private String type;

    private static final String big = "BigData";

    private static final long serialVersionUID = 1L;

    private String info;

    private transient String isAvailable;

    private transient String description;

    private String joi;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getAvailable() {
        return isAvailable;
    }

    public void setAvailable(String available) {
        isAvailable = available;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public BigData(int id, String name, String type, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.joi = joi;
    }

    @Override
    public String toString() {
        return "BigData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", thisInfo='" + info + '\'' +
                ", des='" + description + '\'' +
                '}';
    }
}
