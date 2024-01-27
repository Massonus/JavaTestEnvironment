package org.test.pLesson35.p2;

import org.test.pLesson35.p2.entity.Animal;
import org.test.pLesson35.p2.entity.Cat;

public class p5_getBoolean {
    public static void main(String[] args) {
        Class classCat = Cat.class;
        Class classNested1 = Cat.Nested1.class;
        Class classNested1A = Cat.Nested1.Nested1ClasA.class;

        System.out.println("isAnonymousClass           : " + classCat.isAnonymousClass());
        System.out.println("isEnum                     : " + classCat.isEnum());
        System.out.println("isHidden                   : " + classCat.isHidden());
        System.out.println("isArray                    : " + classCat.isArray());
        System.out.println("isAssignableFrom Cat.class : " + classCat.isAssignableFrom(Cat.class));
        System.out.println("isInstance Animal.class    : " + classCat.isInstance(Animal.class));
        System.out.println("isInterface                : " + classCat.isInterface());
        System.out.println("isLocalClass               : " + classCat.isLocalClass());
        System.out.println("isMemberClass              : " + classCat.isMemberClass());
        System.out.println("isNestmateOf Cat.class     : " + classCat.isNestmateOf(Cat.class));
        System.out.println("isPrimitive                : " + classCat.isPrimitive());

    }
}

