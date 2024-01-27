package org.test.lesson6;

public class DeviceUtils {

    Device getdevice(Device device) {
        device.setName("This");
        return device;
    }

    Device getdevice(String name) {
        return new Device(2, name);
    }

    public Device getdevice(String name, int id) {
        return new Device(id, name);
    }

    public int getdevice(String name, String deviceName) {
        return deviceName.length();
    }

    public int getIdPlusOne(Device device) {
        return device.getId() + 1;
    }

    public static void printDevice (Device device) {
        System.out.println(device);
    }

    public void printInt (String s, int ... args) {
        System.out.println(args[0]);
    }

}
