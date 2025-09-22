package devices;

// Test class for both Brand A and Brand B devices
public class TestDevices {
    public static void main(String[] args) {
        SmartDeviceFactory factoryA = new BrandAFactory(); // Brand A factory
        SmartDeviceFactory factoryB = new BrandBFactory(); // Brand B factory

        BrandA_SmartBulb bulbA = (BrandA_SmartBulb) factoryA.createSmartBulb(); // Brand A bulb
        BrandA_SmartLock lockA = (BrandA_SmartLock) factoryA.createSmartLock(); // Brand A lock

        BrandB_SmartBulb bulbB = (BrandB_SmartBulb) factoryB.createSmartBulb(); // Brand B bulb
        BrandB_SmartLock lockB = (BrandB_SmartLock) factoryB.createSmartLock(); // Brand B lock

        bulbA.setPowerUsage(9.5f); // simulate usage from CSV
        lockA.setBatteryUsage(1.2f);
        bulbB.setPowerUsage(7.5f);
        lockB.setBatteryUsage(0.8f);

        System.out.println("--- Test: Bulb from Brand A ---");
        bulbA.turnOn();
        System.out.println("Brand A Bulb power usage: " + bulbA.getPowerUsage() + " W");
        bulbA.turnOff();

        System.out.println("\n--- Test: Lock from Brand B ---");
        lockB.lock();
        System.out.println("Brand B Lock battery consumption: " + lockB.getBatteryUsage() + " %/month");
        lockB.unlock();

        System.out.println("\n--- Also show Brand B Bulb and Brand A Lock ---");
        System.out.println("Brand B Bulb usage: " + bulbB.getPowerUsage() + " W");
        System.out.println("Brand A Lock battery consumption: " + lockA.getBatteryUsage() + " %/month");
    }
}
