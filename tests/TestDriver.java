package devices;

// Test class for Brand A devices only
public class TestDriver {
    public static void main(String[] args) {
        System.out.println("   Brand A Smart Devices Demo  ");

        DeviceFactory brandAFactory = new BrandAFactory(); // Brand A factory

        System.out.println("\n--- Bulb ---");
        Bulb bulb = brandAFactory.createBulbWithUsage(); // Brand A bulb
        bulb.turnOn();
        System.out.printf("Power usage: %.2f W\n", bulb.getPowerUsage());
        bulb.turnOff();

        System.out.println("\n--- Lock ---");
        Lock lock = brandAFactory.createLockWithUsage(); // Brand A lock
        lock.lock();
        System.out.printf("Battery consumption: %.2f %%/month\n", lock.getBatteryConsumption());
        lock.unlock();
    }
}
