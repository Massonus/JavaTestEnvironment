package org.test.lesson12.p6;

public class Phone {

    private int id;

    private String name;

    private PhoneTypes types;

    private int code;

    public Phone(int id, String name, PhoneTypes types) {
        this.id = id;
        this.name = name;
        this.types = types;
    }

    public Phone() {
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

    public PhoneTypes getTypes() {
        return types;
    }

    public void setTypes(PhoneTypes types) {
        this.types = types;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", types=" + types +
                ", code=" + code +
                '}';
    }
}
