package org.test.pLesson22.p2.waitNotify.solution;

public class Product {
    int id;
    boolean isProduced;

    synchronized void getIdProduct() {
        if (!isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get " + this.id);
        isProduced = false;

        notify();
    }

    synchronized void setIdProduct(int id){
        if (isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.id = id;
        System.out.println("Set " + this.id);
        isProduced = true;

        notify();
    }

}
