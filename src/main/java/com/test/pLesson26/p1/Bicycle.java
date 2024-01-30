package com.test.pLesson26.p1;

public class Bicycle {
    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Lets go!");
    }

    public class HandleBar {
        public void right() {
            System.out.println("HandleBar right!");
        }

        public void left() {

            System.out.println("HandleBar left!");
        }
    }

    public class Seat {
        public void up() {
            System.out.println("Seat up!");
        }

        public void down() {
            System.out.println("Seat down!");
        }
    }

    public static void main(String[] args) {
        Bicycle fort = new Bicycle("fort", 120);
        HandleBar handleBar = fort.new HandleBar();
        Seat seat = fort.new Seat();

        seat.up();
        fort.start();
        handleBar.left();
        handleBar.right();
    }
}
