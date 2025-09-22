package devices;

// Abstract factory for smart devices
public abstract class DeviceFactory {
    protected abstract String brandName(); // returns brand name
    protected abstract Bulb makeBulb(); // makes a bulb
    protected abstract Lock makeLock(); // makes a lock

    public Bulb createBulbWithUsage() { // creates bulb and sets usage
        Bulb b = makeBulb();
        double usage = UsageReader.getUsageFor(brandName(), "bulb");
        b.setPowerUsage(usage);
        return b;
    }

    public Lock createLockWithUsage() { // creates lock and sets usage
        Lock l = makeLock();
        double usage = UsageReader.getUsageFor(brandName(), "lock");
        l.setBatteryConsumption(usage);
        return l;
    }
}
