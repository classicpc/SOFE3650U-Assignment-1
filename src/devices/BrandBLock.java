package devices;

public class BrandBLock implements Lock {
    private double batteryConsumption;

    public BrandBLock(double initialBatteryConsumption) { this.batteryConsumption = initialBatteryConsumption; }

    @Override
    public void lock() { System.out.println("BrandBLock locked."); }

    @Override
    public void unlock() { System.out.println("BrandBLock unlocked."); }

    @Override
    public double getBatteryConsumption() { return batteryConsumption; }

    @Override
    public void setBatteryConsumption(double percentPerMonth) { this.batteryConsumption = percentPerMonth; }
}
