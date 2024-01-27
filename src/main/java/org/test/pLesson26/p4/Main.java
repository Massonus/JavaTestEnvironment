package org.test.pLesson26.p4;

public class Main {


    public static void main(String[] args) {

        /*final Flower flower = new Flower(1, "red", "dsds");

        final Flower.Sun flowerSun = flower.new Sun(2, "Green", "value");

        flowerSun.print();

        FlowerUtil flowerUtil = new FlowerUtil(flower);

        final FlowerUtil.FlowerBean flowerBean = flowerUtil.getFlowerBean();

        System.out.println(flowerBean);

        FlowerUtil.FlowerBean flowerBean1 = new FlowerUtil.FlowerBean();*/

        Power power = new Power();

        power.print("Hello");

        Power power1 = new Power() {
            @Override
            public void print(final String message) {
                System.out.println("Do you have " + message);
            }
        };

        power1.print("Hello");

        BadPower badPower = () -> System.out.println("Hello world");

        badPower.printer();

    }

}
