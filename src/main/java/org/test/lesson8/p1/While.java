package org.test.lesson8.p1;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        int x = 100;
        int y = 200;

        while (++x < --y);

        System.out.println("Average value = " + x);
    }
}
