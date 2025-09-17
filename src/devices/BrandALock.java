package devices;

public class BrandALock implements Lock {
    private double batteryConsumption;

    public BrandALock(double initialBatteryConsumption) { this.batteryConsumption = initialBatteryConsumption; }

    @Override
    public void lock() { System.out.println("BrandALock locked."); }

    @Override
    public void unlock() { System.out.println("BrandALock unlocked."); }

    @Override
    public double getBatteryConsumption() { return batteryConsumption; }

    @Override
    public void setBatteryConsumption(double percentPerMonth) { this.batteryConsumption = percentPerMonth; }
}
