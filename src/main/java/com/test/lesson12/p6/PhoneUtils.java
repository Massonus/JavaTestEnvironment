package com.test.lesson12.p6;

import java.util.Scanner;

public class PhoneUtils {

    private static int id;

    public void printPhone(final Phone phone) {
        System.out.println(phone);
    }

    public void addPhone(final Phone phone, int index) {
        final Phone[] smartPhones = PhoneRepo.smartPhones;
        final Phone[] androidPhones = PhoneRepo.androidPhones;
        final Phone[] mobilePhone = PhoneRepo.mobilePhone;

        if (phone.getTypes() == PhoneTypes.ANDROID) {
            androidPhones[index] = phone;
        } else if (phone.getTypes() == PhoneTypes.SMART_PHONE) {
            smartPhones[index] = phone;
        } else if (phone.getTypes() == PhoneTypes.MOBILE) {
            mobilePhone[index] = phone;
        }
    }

    public void addPhoneWithSw(final Phone phone, int index) {
        final Phone[] smartPhones = PhoneRepo.smartPhones;
        final Phone[] androidPhones = PhoneRepo.androidPhones;
        final Phone[] mobilePhone = PhoneRepo.mobilePhone;

        final PhoneTypes phoneTypes = phone.getTypes();

        switch (phoneTypes) {
            case SMART_PHONE:
                smartPhones[index] = phone;
                break;
            case ANDROID:
                androidPhones[index] = phone;
                break;
            case MOBILE:
                mobilePhone[index] = phone;
                break;
            default:
                System.out.println("Incorrect symbol");
        }
    }

    public void setUp() {
        final Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Chose category");
            System.out.println("If you want create Mobile input 0");
            System.out.println("If you want create smart phone input 1");
            System.out.println("If you want create android phone input 2");
            number = scanner.nextInt();

            Phone phone = new Phone();

            if (1 == number) {
                id++;
                phone.setTypes(PhoneTypes.MOBILE);
                phone.setId(id);
                phone.setName("Phone" + id);
                phone.setCode(PhoneTypes.MOBILE.getCodes());
                System.out.println(phone);
            } else if (2 == number) {
                id++;
                phone.setTypes(PhoneTypes.ANDROID);
                phone.setId(id);
                phone.setName("Phone" + id);
                phone.setCode(PhoneTypes.ANDROID.getCodes());
                System.out.println(phone);
            } else if (3 == number) {
                id++;
                phone.setTypes(PhoneTypes.SMART_PHONE);
                phone.setId(id);
                phone.setName("Phone" + id);
                phone.setCode(PhoneTypes.SMART_PHONE.getCodes());
                System.out.println(phone);
            } else {
                System.out.println("Wrong type");
            }

        }  while (number < 1 || number > 2);

    }

}
