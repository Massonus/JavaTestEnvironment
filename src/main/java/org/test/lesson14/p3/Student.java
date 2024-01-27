package org.test.lesson14.p3;

public class Student extends User {

    private Type type;

    public Student(String id, String name, Type type) {
        super(id, name);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }



}
