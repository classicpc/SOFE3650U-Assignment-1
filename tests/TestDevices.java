package devices;

public class TestDevices {
    public static void main(String[] args) {
        DeviceFactory factoryA = new BrandAFactory();
        DeviceFactory factoryB = new BrandBFactory();

        Bulb bulbA = factoryA.createBulbWithUsage();
        Lock lockA = factoryA.createLockWithUsage();

        Bulb bulbB = factoryB.createBulbWithUsage();
        Lock lockB = factoryB.createLockWithUsage();

        System.out.println("=== Test: Bulb from Brand A ===");
        bulbA.turnOn();
        System.out.println("Brand A Bulb power usage: " + bulbA.getPowerUsage() + " W");
        bulbA.turnOff();

        System.out.println("\n=== Test: Lock from Brand B ===");
        lockB.lock();
        System.out.println("Brand B Lock battery consumption: " + lockB.getBatteryConsumption() + " %/month");
        lockB.unlock();

        System.out.println("\n=== Also show Brand B Bulb and Brand A Lock ===");
        System.out.println("Brand B Bulb usage: " + bulbB.getPowerUsage() + " W");
        System.out.println("Brand A Lock battery consumption: " + lockA.getBatteryConsumption() + " %/month");
    }
}
