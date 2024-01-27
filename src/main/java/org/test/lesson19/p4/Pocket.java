package org.test.lesson19.p4;

import java.util.Objects;

public class Pocket {

    private int id;

    private String name;

    public Pocket(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pocket() {
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
        return "Pocket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pocket pocket = (Pocket) o;
        return id == pocket.id && Objects.equals(name, pocket.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
