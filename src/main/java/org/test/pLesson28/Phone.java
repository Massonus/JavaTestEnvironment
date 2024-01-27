package org.test.pLesson28;

import java.util.Objects;

public class Phone {

    private int id;

    private String model;

    private User user;

    public Phone(int id, String model, User user) {
        this.id = id;
        this.model = model;
        this.user = user;
    }

    public Phone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", user=" + user +
                '}';
    }
}
