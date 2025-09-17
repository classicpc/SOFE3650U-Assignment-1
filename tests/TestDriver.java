package devices;

/**
 * Demonstrates:
 *  - create a Bulb from Brand A
 *  - create a Lock from Brand B
 *
 *  The configureUsage() method uses the Factory Method pattern (concrete classes
 *  decide where/how to read the usage values).
 */
public class TestDriver {
    public static void main(String[] args) {
        System.out.println("=== Test: Bulb from Brand A ===");
        SmartDeviceFactory brandA = new BrandAFactory();
        Bulb brandABulb = brandA.createBulb();
        brandABulb.configureUsage();  // factory method inside sets power reading from file
        brandABulb.turnOn();
        System.out.println("Brand A Bulb power usage: " + brandABulb.getPowerUsage() + " W");
        brandABulb.turnOff();

        System.out.println("\n=== Test: Lock from Brand B ===");
        SmartDeviceFactory brandB = new BrandBFactory();
        Lock brandBLock = brandB.createLock();
        brandBLock.configureUsage();  // factory method inside sets battery reading from file
        brandBLock.lock();
        System.out.println("Brand B Lock battery consumption: " + brandBLock.getBatteryConsumption() + " %/month");
        brandBLock.unlock();
    }
}
