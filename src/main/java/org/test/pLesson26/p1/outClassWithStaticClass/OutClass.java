package org.test.pLesson26.p1.outClassWithStaticClass;

public class OutClass {
    private int outClassPrivateVar;
    public int outClassPublicVar;

    private static int outClassPrivateVarStatic;
    public static int outClassPublicVarStatic;

    public void outClassMethod(){
        InStaticClass.inStaticClassPrivateVarStatic = 0;
        InStaticClass.inStaticClassMethodStatic();

        InStaticClass inStaticClass = new InStaticClass();
        inStaticClass.inStaticClassPrivateVar = 0;
        inStaticClass.inStaticClassMethod();
    }

    public static void outClassMethodStatic(){

    }


    static class InStaticClass{
        private int inStaticClassPrivateVar;
        public int inStaticClassPublicVar;

        private static int inStaticClassPrivateVarStatic;
        public static int inStaticClassPublicVarStatic;

        public void inStaticClassMethod(){
            OutClass outClass = new OutClass();

            outClass.outClassPrivateVar = 0;
            outClassPrivateVarStatic = 0;

            outClass.outClassMethod();
            outClassMethodStatic();
        }

        public static void inStaticClassMethodStatic(){

        }
    }

}

