package com.test.pLesson25.cloneable.deep;


import com.test.pLesson25.cloneable.deep.usingSerialization.Group;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(1);
        Account account = new Account(1, "100", group);

        Account cloneAccount1 = new Account(account);
        Account cloneAccount2 = Account.deepCopyByFactoryMethod(account);

        System.out.println("main object - " + account);
        System.out.println("clone object by constructor - " + cloneAccount1);
        System.out.println("clone object by factory method - " + cloneAccount2);

        cloneAccount1.setBalance("2000");
        cloneAccount1.getGroup().setId(2);

        System.out.println("\nAfter set new value to cloneAccount1");
        System.out.println("main object - " + account);
        System.out.println("clone object by constructor - " + cloneAccount1);

        cloneAccount2.setBalance("3000");
        cloneAccount2.getGroup().setId(3);

        System.out.println("\nAfter set new value to cloneAccount2");
        System.out.println("main object - " + account);
        System.out.println("clone object by factory method - " + cloneAccount2);

    }
}
