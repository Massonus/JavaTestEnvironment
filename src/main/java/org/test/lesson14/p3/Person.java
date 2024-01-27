package org.test.lesson14.p3;

public class Person extends User {

    private Gender gender;

    public Person(String id, String name, Gender gender) {
        super(id, name);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                '}';
    }
}
