package com.test.pLesson25.cloneable.deep.usingSerialization;

import java.io.Serializable;

public class Group implements Serializable {
    private int id;

    public Group(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                '}';
    }
}
