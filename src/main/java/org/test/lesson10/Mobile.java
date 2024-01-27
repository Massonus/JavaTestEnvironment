package org.test.lesson10;

public class Mobile {

    private int id;

    private String name;

    private Battery battery;

    public static int count = 0;

    public Mobile() {
        count ++;
    }

    public Mobile(int id, String name, Battery battery) {
        this.id = id;
        this.name = name;
        this.battery = battery;
        count ++;
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

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", battery=" + battery +
                '}';
    }
}
