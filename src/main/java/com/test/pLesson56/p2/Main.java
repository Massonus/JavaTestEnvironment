package com.test.pLesson56.p2;


import com.test.pLesson56.p1.entity.Personal;
import com.test.pLesson56.p1.entity.Printer;
import com.test.pLesson56.p1.entity.Role;

public class Main {

    public static void main(String[] args) {

        Utils utils = new Utils();

        Personal personal = new Personal();
        personal.setName("John");

        utils.savePerson(personal);

        Printer printer = new Printer();
        printer.setType("Xerox");
        printer.setName("Samsung");
        printer.setPersonal(personal);

        utils.savePrinter(printer);

        final Printer printer1 = utils.gedPrinter(1);
        System.out.println(printer1);

        Role role = new Role();

    }

}
