package org.test.pLesson26.p1.createObject;

public class OutClass {

    class InClass {
    }

    private class InPrivateClass {
    }

    private class ClassImpl implements InterfaceInClass {
        @Override
        public int method() {
            return 0;
        }
    }

    public InterfaceInClass getClassImpl() {
        return new ClassImpl();
    }
}

interface InterfaceInClass {
    int method();
}


class Main {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.InClass inClass = outClass.new InClass();
//        OutClass.InPrivateClass inPrivateClass = outClass.new InPrivateClass();

        InterfaceInClass classImpl = outClass.getClassImpl();
        classImpl.method();
    }
}

