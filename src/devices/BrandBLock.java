package devices;

// Brand B's implementation of a smart lock
public class BrandBLock implements Lock {
    private double batteryConsumption; // stores battery usage

    public BrandBLock(double initialBatteryConsumption) { this.batteryConsumption = initialBatteryConsumption; } // constructor

    @Override
    public void lock() { System.out.println("BrandBLock locked."); } // print locked

    @Override
    public void unlock() { System.out.println("BrandBLock unlocked."); } // print unlocked

    @Override
    public double getBatteryConsumption() { return batteryConsumption; } // get battery usage

    @Override
    public void setBatteryConsumption(double percentPerMonth) { this.batteryConsumption = percentPerMonth; } // set battery usage
}
