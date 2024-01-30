package com.test.lesson7.p4.utils;

import com.test.lesson7.p4.entity.Car;
import com.test.lesson7.p4.entity.Person;

import java.util.Scanner;

public class Utils {

    public void printCar(final Car car, final int id) {

        if (car.getPerson().getId() == id) {
            System.out.println("All is ok");
        } else if (car.getPerson().getName().equals("Petro")) {
            System.out.println("This is petro");
        } else if (car.getPerson().getId() < id) {
            System.out.println("This id bigger than person`s id");
        } else {
            System.out.println("End");
        }

        if (car.getPerson().getName().equals("Petro")) {
            System.out.println("This is petro");
        }

    }

    public void setUpConsole() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the type of chose, please use only numbers from 0 to 3");
        System.out.println("Please input 1 if you want to crete a car");
        System.out.println("Please input 2 if you want to see person name");
        System.out.println("Please input 3 if you want to see person id");
        System.out.println("Please input 0 if you to stop");

        final int type = scanner.nextInt();


        switch (type){
            case 1:
                Car car = new Car();
                System.out.println("1 Input car name");
                Scanner scanner1 = new Scanner(System.in);
                final String name = scanner1.nextLine();
                car.setName(name);
                System.out.println("2 Input car type");
                Scanner scanner2 = new Scanner(System.in);
                final String types = scanner2.nextLine();
                car.setType(types);
                System.out.println(car);
                break;
            case 2:
                Person person = new Person();
                person.setName("Jon");
                System.out.println(person.getName());
                break;
            case 3:
                Person person1 = new Person();
                person1.setId(1);
                System.out.println(person1.getId());
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect symbol");
        }

    }


}
