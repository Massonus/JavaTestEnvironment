package org.test.lesson12.p1;

public class Main {

//    enum Days {MONDAY, TUESDAY,  WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}


    public static void main(String[] args) {
        int dayNumber = 3;

        Days day = switch (dayNumber){
            case 2 -> Days.TUESDAY;
            case 3 -> Days.WEDNESDAY;
            case 4 -> Days.THURSDAY;
            case 5 -> Days.FRIDAY;
            case 6 -> Days.SATURDAY;
            case 7 -> Days.SUNDAY;
            default -> Days.MONDAY;
        };

        if (day == Days.SATURDAY || day == Days.SUNDAY)
            System.out.println("It is weekend");
        else
            System.out.println("It is busines day");


    }
}
