package org.test.lesson13.p2;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
       /* System.out.println("buffer - " + stringBuffer);
        System.out.println("length - " + stringBuffer.length());
        System.out.println("capacity - " + stringBuffer.capacity());*/

        //method setLength
        /*stringBuffer.setLength(8);
        System.out.println("new buffer - " + stringBuffer);
*/
        //method ensureCapacity
        stringBuffer.ensureCapacity(18);
        System.out.println("low then original capacity - " + stringBuffer.capacity());
        stringBuffer.ensureCapacity(25);
        System.out.println("high then original capacity - " + stringBuffer.capacity());

        //method setCharAt
   /*     stringBuffer.setCharAt(0, 'W');
        System.out.println("new buffer - " + stringBuffer);*/

        //method append
        stringBuffer.append(" World");
        System.out.println("new buffer - " + stringBuffer);
//
//        String s;
//        int a = 10;
//        StringBuffer sb = new StringBuffer(15);
//        s = sb.append("a = ") .append(a) .append("!") .toString();
//        System.out.println(s);

        //method insert
//        stringBuffer.insert(0, " World ");
//        System.out.println("new buffer - " + stringBuffer);

        //method reverse
      /*  System.out.println("reverse buffer - " + stringBuffer.reverse());*/

        //method delete
        System.out.println("delete - " + stringBuffer.delete(0, 2));

        //method deleteCharAt
        /*System.out.println("deleteCharAt - " + stringBuffer.deleteCharAt(3));*/


        //method equals
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");

 /*       System.out.println(stringBuilder1.equals(stringBuilder2));
        System.out.println(stringBuilder1 == stringBuilder2);*/

       System.out.println(String.valueOf(stringBuilder1).equals(String.valueOf(stringBuilder2)));


    }
}
