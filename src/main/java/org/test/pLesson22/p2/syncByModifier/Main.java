package org.test.pLesson22.p2.syncByModifier;

public class Main {
    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket(15),
                new Ticket(13),
                new Ticket(25),
                new Ticket(21)
        };

        Cashier cashier1 = new Cashier(1, tickets);
        Cashier cashier2 = new Cashier(4, tickets);
        Cashier cashier3 = new Cashier(3, tickets);
        Cashier cashier4 = new Cashier(2, tickets);

        cashier1.start();
        cashier2.start();
        cashier3.start();
        cashier4.start();
    }

}
