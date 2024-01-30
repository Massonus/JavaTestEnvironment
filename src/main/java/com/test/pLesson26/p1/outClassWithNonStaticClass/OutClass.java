package com.test.pLesson26.p1.outClassWithNonStaticClass;

public class OutClass {
    private int outClassPrivateVar;
    public int outClassPublicVar;
    private static int outClassPrivateVarStatic;
    public static int outClassPublicVarStatic;

    public void outClassMethod() {
        InClass inClass = new InClass();

        inClass.inClassMethod();
        inClass.inClassPrivateVar = 0;
        inClass.inClassPublicVar = 1;
    }

    public static void outClassMethodStatic() {
    }

    class InClass {
        private int inClassPrivateVar;
        public int inClassPublicVar;

        //static declarations in inner classes are not supported (java 16)
//        private static int inClassPrivateVarStatic;
//        public static int inClassPublicVarStatic;

        public void inClassMethod() {
            outClassPrivateVar = 0;
            outClassPrivateVarStatic = 0;
            outClassMethod();
            outClassMethodStatic();
        }
    }
}

