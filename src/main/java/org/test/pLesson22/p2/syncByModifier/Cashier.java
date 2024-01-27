package org.test.pLesson22.p2.syncByModifier;

public class Cashier extends Thread {
    int id;
    Ticket[] tickets;

    Cashier(int id, Ticket[] tickets) {
        this.id = id;
        this.tickets = tickets;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < tickets.length; i++) {
//            /* violation block
//            if (!tickets[i].isBought){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//                tickets[i].isBought = true;
//                System.out.println("Cashier " + id + " sold ticket " + tickets[i].place);
//            }

            tickets[i].buy(this);   //solution block
        }
    }
}
