package devices;

// Test class for both Brand A and Brand B devices
public class TestDevices {
    public static void main(String[] args) {
        DeviceFactory factoryA = new BrandAFactory(); // Brand A factory
        DeviceFactory factoryB = new BrandBFactory(); // Brand B factory

        Bulb bulbA = factoryA.createBulbWithUsage(); // Brand A bulb
        Lock lockA = factoryA.createLockWithUsage(); // Brand A lock

        Bulb bulbB = factoryB.createBulbWithUsage(); // Brand B bulb
        Lock lockB = factoryB.createLockWithUsage(); // Brand B lock

        System.out.println("--- Test: Bulb from Brand A ---");
        bulbA.turnOn();
        System.out.println("Brand A Bulb power usage: " + bulbA.getPowerUsage() + " W");
        bulbA.turnOff();

        System.out.println("\n--- Test: Lock from Brand B ---");
        lockB.lock();
        System.out.println("Brand B Lock battery consumption: " + lockB.getBatteryConsumption() + " %/month");
        lockB.unlock();

        System.out.println("\n--- Also show Brand B Bulb and Brand A Lock ---");
        System.out.println("Brand B Bulb usage: " + bulbB.getPowerUsage() + " W");
        System.out.println("Brand A Lock battery consumption: " + lockA.getBatteryConsumption() + " %/month");
    }
}
