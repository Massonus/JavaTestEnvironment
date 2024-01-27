package org.test.pLesson22.p2.waitNotify.violation;

public class Product {
    int id;

    synchronized void getIdProduct(){
        System.out.println("Get " + this.id);
    }

    synchronized void setIdProduct(int id){
        this.id = id;
        System.out.println("Set " + this.id);
    }

}
