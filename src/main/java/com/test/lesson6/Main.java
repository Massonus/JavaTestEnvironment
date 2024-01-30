package com.test.lesson6;

public class Main {

    public static void main(String[] args) {
        DeviceUtils deviceUtils = new DeviceUtils();
        Device device = new Device(1, "Name");
        deviceUtils.getdevice(device);
        System.out.println(device);

        final Device kiss = deviceUtils.getdevice("Kiss");

        System.out.println(kiss);

        final int idPlusOne = deviceUtils.getIdPlusOne(device);
        System.out.println(idPlusOne);

        final int dev = deviceUtils.getdevice("ss", "11");

        DeviceUtils.printDevice(device);

    }

}
