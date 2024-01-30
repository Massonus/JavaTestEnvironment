package com.test.pLesson22.p2.waitNotify.violation;

public class Consumer extends Thread {
    Product product;
    int count;

    public Consumer(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            product.getIdProduct();
        }
    }
}
