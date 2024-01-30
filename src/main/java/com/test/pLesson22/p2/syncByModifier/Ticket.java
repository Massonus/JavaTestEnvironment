package com.test.pLesson22.p2.syncByModifier;


public class Ticket {
    boolean isBought;
    int place;

    public Ticket(int place) {
        this.place = place;
    }

     void buy (Cashier cashier){
        synchronized (this){
            if (!isBought){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                isBought = true;
                System.out.println("Cashier " + cashier.id + " sold ticket " + this.place);
            }
        }
    }
}
