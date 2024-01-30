package com.test.lesson16.p3;


public class Car {
    private int gasVolume = 0;
    private int speed;

    public Car(int gasVolume, int speed) {
        this.gasVolume = gasVolume;
        this.speed = speed;
    }

    public void run() throws GasRanOutException, SpeedingException, PenaltyException {
        int distance = 0;

        if (speed > 80)
            throw new PenaltyException("You have received a penalty", new SpeedingException("For speeding"));

        while (gasVolume > 0) {
            distance++;
            gasVolume--;
        }
        System.out.println("you have driven " + distance + " km");
        throw new GasRanOutException("Fill the car");
    }

    public static void main(String[] args) {
        Car car = new Car(20, 90);

        try {
            car.run();
        } catch (GasRanOutException | SpeedingException | PenaltyException e) {
            System.out.println("Exception - " + e.getClass());
            System.out.println("Alert - " + e.getMessage());
            System.out.println("Cause - " + e.getCause());
        }
    }


}
