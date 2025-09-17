package devices;

/**
 * Abstract factory (template) that creates products and then sets their usage values
 * by reading from an external provider (UsageReader).
 */
public abstract class DeviceFactory {
    protected abstract String brandName();

    protected abstract Bulb makeBulb();
    protected abstract Lock makeLock();

    public Bulb createBulbWithUsage() {
        Bulb b = makeBulb();
        double usage = UsageReader.getUsageFor(brandName(), "bulb");
        b.setPowerUsage(usage);
        return b;
    }

    public Lock createLockWithUsage() {
        Lock l = makeLock();
        double usage = UsageReader.getUsageFor(brandName(), "lock");
        l.setBatteryConsumption(usage);
        return l;
    }
}
