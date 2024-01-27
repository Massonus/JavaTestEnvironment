package org.test.pLesson57.p3;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ParentUtils parentUtils = new ParentUtils();

        Parent parent = new Parent();
        parent.setName("Cat");

        parentUtils.saveParent(parent);

        for (int i = 0; i < 10; i++) {
            Child child = new Child();
            child.setName("name" + i);
            child.setParent(parent);
            parentUtils.saveChild(child);
        }

        final List<Child> allChild = parentUtils.getAllChild();

        for (Child child : allChild) {
            System.out.println(child.getParent().getId());
        }

    }

}
