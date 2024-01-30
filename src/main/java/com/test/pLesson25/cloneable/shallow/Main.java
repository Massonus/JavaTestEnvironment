package com.test.pLesson25.cloneable.shallow;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(1);
        Account account = new Account(1, "1000", group);

        try {
            Account cloneAccount = (Account) account.clone();
            System.out.println("main object - " + account);
            System.out.println("clone object - " + cloneAccount);

            cloneAccount.setBalance("2000");
            cloneAccount.getGroup().setId(2);

            System.out.println("\nAfter set new value");
            System.out.println("main object - " + account);
            System.out.println("clone object - " + cloneAccount);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
