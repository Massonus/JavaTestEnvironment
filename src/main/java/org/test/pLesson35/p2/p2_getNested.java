package org.test.pLesson35.p2;

import org.test.pLesson35.p2.entity.Cat;

public class p2_getNested {
    public static void main(String[] args) {
        Class classCat = Cat.class;

        System.out.println("===== getDeclaredClasses ======");
        Object[] declaredClasses = classCat.getDeclaredClasses();
        for (Object declaredClass : declaredClasses) {
            System.out.println(declaredClass);
        }

        System.out.println("\n===== getNestMembers ======");
        Object[] nestMembers = classCat.getNestMembers();
        for (Object nestMember : nestMembers) {
            System.out.println(nestMember);
        }

        System.out.println("\ngetDeclaringClass Cat : " + classCat.getDeclaringClass());
        System.out.println("getEnclosingClass Cat : " + classCat.getEnclosingClass());

        Class classNested1 = Cat.Nested1.class;
        System.out.println("getDeclaringClass Cat.Nested1 : " + classNested1.getDeclaringClass());
        System.out.println("getEnclosingClass Cat.Nested1 : " + classNested1.getEnclosingClass());

        Class classNested1A = Cat.Nested1.Nested1ClasA.class;
        System.out.println("getDeclaringClass Cat.Nested1.Nested1ClasA : " + classNested1A.getDeclaringClass());
        System.out.println("getEnclosingClass Cat.Nested1.Nested1ClasA : " + classNested1A.getEnclosingClass());

        System.out.println("\n===== getNestHost ======");
        System.out.println("getNestHost Cat                      : " + classCat.getNestHost());
        System.out.println("getNestHost Cat.Nested1              : " + classNested1.getNestHost());
        System.out.println("getNestHost Cat.Nested1.Nested1ClasA : " + classNested1A.getNestHost());

    }
}
