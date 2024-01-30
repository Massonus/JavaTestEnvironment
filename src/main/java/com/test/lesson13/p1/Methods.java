package com.test.lesson13.p1;

public class Methods {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
     /*   System.out.println(helloWorld);*/

       /* System.out.println(helloWorld.length());*/

        //method charAt
  /*      System.out.println(helloWorld.charAt(3));*/

        //method getChars
        /*char[] chars = new char[6];
        helloWorld.getChars(1, 4, chars, 3);
       System.out.println(chars);*/

        //method toCharArray
        /*char[] chars2 = helloWorld.toCharArray();
       for (char c : chars2) {
           System.out.print(c + " ");
        }*/

        //method getBytes
       /* for (byte aByte : helloWorld.getBytes()) {
            System.out.print(aByte + " ");
        }*/


        //method regionMatches
        /*System.out.println("Hello world!!!".regionMatches(6, "world", 0, 3));*/

        //method endsWith
       /*System.out.print("Hello World endsWith 'ld' - ");
        System.out.println(helloWorld.endsWith("ld"));*/

        //method startsWith
      /*  System.out.print("Hello World startsWith 'Hel' - ");
       System.out.println(helloWorld.startsWith("Hel"));*/

        //method contains
        /*System.out.print("Hello World contains 'll' - ");
        System.out.println(helloWorld.contains("H"));*/

        //method indexOf
//        System.out.println(helloWorld.indexOf('o'));
//        System.out.println(helloWorld.indexOf('o', 5));

        //method lastIndexOf
//        System.out.println(helloWorld.lastIndexOf('o'));
//        System.out.println(helloWorld.lastIndexOf('o', 6));


        //method substring
//        System.out.println(helloWorld.substring(3));
//        System.out.println(helloWorld.substring(3, 7));


        //method replace
        System.out.println(helloWorld.replace("l", "K"));


        //method trim
        String s = "   Hello";
        System.out.println(s);
        System.out.println(s.trim());


        //method toLowerCase, toUpperCase
        final String lowerCase = helloWorld.toLowerCase();
        System.out.println(lowerCase);
        System.out.println(helloWorld.toUpperCase());


        //method join
       String[] array = {"Alpha", "Beta" , "Gamma"};
       String result = String.join(" ", array);
       System.out.println(result);
       String result2 = String.join(",", array);
       System.out.println(result2);


        //method split
        /*String st = "Alpha, Beta, Gamma";
        String[] array = st.split(", ");
        for (String s : array) {
            System.out.println(s);
       }

*/






    }


}
