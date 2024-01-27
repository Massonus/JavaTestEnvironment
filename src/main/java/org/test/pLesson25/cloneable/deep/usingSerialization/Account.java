package org.test.pLesson25.cloneable.deep.usingSerialization;

import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String balance;
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Account(int id, String balance, Group group) {
        this.id = id;
        this.balance = balance;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance='" + balance + '\'' +
                ", group=" + group +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
