package org.test.pLesson26.p4;

public class Power implements BadPower {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print(final String message) {
        System.out.println("this message " + message);
    }

    @Override
    public void printer() {

    }
}
