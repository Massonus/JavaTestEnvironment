package com.test.pLesson57;

public class Main {

    public static void main(String[] args) {
       /* final Juice juice = new Juice();
        juice.setName("Orange")1;

        final Juice juice1 = new Juice();
        juice1.setName("Apple");

        final Juice juice2 = new Juice();
        juice2.setName("Green");

        final Juice juice3 = new Juice();
        juice3.setName("Green1");

        final Juice juice4 = new Juice();
        juice4.setName("Green2");

        JuceUtils utils = new JuceUtils();
        utils.saveJuce(juice);
        utils.saveJuce(juice1);
        utils.saveJuce(juice2);
        utils.saveJuce(juice3);
        utils.saveJuce(juice4);

        final List<Juice> allJuces = utils.getAllJuces();
        System.out.println(allJuces);

        final Juice byId = utils.getById(1);

        final List<String> nameFromJuice = utils.getNameFromJuice();

        System.out.println(byId);
        System.out.println(nameFromJuice);*/

        JuceUtils utils = new JuceUtils();

        ContactPerson contactPerson = new ContactPerson();
        contactPerson.setPhone("123");
        contactPerson.setFirstName("Jo");
        contactPerson.setLastName("Smith");

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName("one");
        manufacturer.setContactPerson(contactPerson);

        utils.saveManufacturer(manufacturer);

        Orange orange = new Orange();
        orange.setType("Big");

        utils.saveOrange(orange);

        Juice juice = new Juice();
        juice.setName("Or");
        juice.setOrange(orange);

        utils.saveJuce(juice);




      /*  juice.setOrange(orange);*/




        System.out.println(utils.getAllJuces());


    }

}
