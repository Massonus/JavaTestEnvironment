package com.test.pLesson25.cloneable.deep;


import com.test.pLesson25.cloneable.deep.usingSerialization.Group;

public class Account {
    private int id;
    private String balance;
    private Group group;

    public Account(int id, String balance, Group group) {
        this.id = id;
        this.balance = balance;
        this.group = group;
    }

    //by constructor
    public Account(Account other) {
        this(other.id, other.balance, new Group(other.getGroup().getId()));
    }

    //by factory method
    public static Account deepCopyByFactoryMethod(Account other) {
        Account account = new Account(other.id, other.balance, new Group(other.getGroup().getId()));
        return account;
    }

    public Group getGroup() {
        return group;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance='" + balance + '\'' +
                ", group=" + group +
                '}';
    }
}