package com.test.pLesson41;

import com.test.pLesson41.entity.Laptop;
import com.test.pLesson41.repository.LaptopRepository;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        try {
//            LaptopRepository.createLaptop();
            /*final int i = LaptopRepository.insertValue(1, "'Name'", true, "'Description'");
            final int i1 = LaptopRepository.insertValue(2, "'Name1'", true, "'Description1'");
            final int i2 = LaptopRepository.insertValue(3, "'Name1'", true, "'Description1'");*/

            Laptop laptop = new Laptop(11, "Prepare", true, "New");

            LaptopRepository.insertIntoPrepare(laptop);

            final List<Laptop> laptops = LaptopRepository.gatAllLaptops();

            laptops.forEach(System.out::println);

            /*LaptopRepository.getLaptops("1 OR 1=1");*/

/*            LaptopRepository.batchProcessing();*/

         /*   LaptopRepository.transactionExample();*/

        /*    LaptopRepository.getCallableStatementWithParams(1);*/

            /*final int i = LaptopRepository.insertValue(47, "'Name'", true, "'Description'");*/

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
