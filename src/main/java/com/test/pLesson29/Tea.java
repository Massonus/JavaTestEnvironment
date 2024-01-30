package com.test.pLesson29;

import java.util.Objects;

public class Tea {

    private int id;

    private String name;

    private Type type;

    private Company company;

    public Tea(int id, String name, Type type, Company company) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.company = company;
    }

    public Tea() {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tea tea = (Tea) o;
        return id == tea.id && Objects.equals(name, tea.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
