package org.test.lesson17.p1;

public class Wrapper {

    public static int getInt(Integer i){
        return ++i;
    }


    public static void main(String[] args) {
        Integer i = Integer.valueOf(15);
        Double d =  Double.valueOf("3.14");
        Boolean b = Boolean.valueOf(false);

        System.out.println(d.doubleValue());

        try {
            Short s = Short.valueOf("230a");
        }catch (NumberFormatException e){
            System.out.println("Catch - " + e.getMessage());
        }


        Integer boxing = 100;
        int unboxing = boxing;

        Double d2 = 30d;
        d2 = d2 + boxing;

        Integer intFromMethod = getInt(20);


//        Boolean b2 = true;
//        if (b2)
//            System.out.println("b2 = " + b2);


//        Integer obj = 3;
//        switch(obj){
//            case 1 -> System.out.println("one");
//            case 2 -> System.out.println("one");
//        }


//        Integer iObj = 1000;
//        int value = iObj.byteValue();
//        System.out.println(value);


    }
}
