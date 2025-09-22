package devices;

// Brand A's implementation of a smart lock
public class BrandALock implements Lock {
    private double batteryConsumption; // stores battery usage

    public BrandALock(double initialBatteryConsumption) { this.batteryConsumption = initialBatteryConsumption; } // constructor

    @Override
    public void lock() { System.out.println("BrandALock locked."); } // print locked

    @Override
    public void unlock() { System.out.println("BrandALock unlocked."); } // print unlocked

    @Override
    public double getBatteryConsumption() { return batteryConsumption; } // get battery usage

    @Override
    public void setBatteryConsumption(double percentPerMonth) { this.batteryConsumption = percentPerMonth; } // set battery usage
}
