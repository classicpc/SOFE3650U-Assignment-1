package devices;

// Test class for Brand A devices only
public class TestDriver {
    public static void main(String[] args) {
        System.out.println("   Brand A Smart Devices Demo  ");

        SmartDeviceFactory brandAFactory = new BrandAFactory(); // Brand A factory

        System.out.println("\n--- Bulb ---");
        BrandA_SmartBulb bulb = (BrandA_SmartBulb) brandAFactory.createSmartBulb(); // Brand A bulb
        bulb.setPowerUsage(9.5f); // simulate usage from CSV
        bulb.turnOn();
        System.out.printf("Power usage: %.2f W\n", bulb.getPowerUsage());
        bulb.turnOff();

        System.out.println("\n--- Lock ---");
        BrandA_SmartLock lock = (BrandA_SmartLock) brandAFactory.createSmartLock(); // Brand A lock
        lock.setBatteryUsage(1.2f); // simulate usage from CSV
        lock.lock();
        System.out.printf("Battery consumption: %.2f %%/month\n", lock.getBatteryUsage());
        lock.unlock();
    }
}
