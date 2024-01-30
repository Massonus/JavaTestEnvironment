package com.test.pLesson58;

import com.test.pLesson56.p1.entity.Flower;
import com.test.pLesson56.p1.repository.RepositoryGet;

public class TestRunner {


    public static void main(String[] args) {

        final Flower flower = new Flower();
        flower.setName("test");

        final Boolean isSave = RepositoryGet.saveFlower(flower);
        System.out.println(isSave);

        SuperUtils superUtils = new SuperUtils();
        System.out.println(superUtils.getFlowers());

        final Flower test = superUtils.getFlower("test");

        System.out.printf("my Flower is %s%n", test);

        test.setName("newflower");

        System.out.printf("my Flower updated %s%n", superUtils.updateFlower(test));

        System.out.printf("my Flower deleted %s%n", superUtils.deleteFlower(test));
    }

}
