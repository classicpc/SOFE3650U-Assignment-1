package devices;

// Brand A's implementation of a smart lock (renamed to BrandA_SmartLock)
public class BrandA_SmartLock implements SmartLock {
    private float batteryUsage; // stores battery usage

    public BrandA_SmartLock(float initialBatteryUsage) { this.batteryUsage = initialBatteryUsage; } // constructor

    @Override
    public void setBatteryUsage(float x) { this.batteryUsage = x; } // set battery usage

    @Override
    public float getBatteryUsage() { return batteryUsage; } // get battery usage

    // Added for test output
    public void lock() { System.out.println("BrandALock locked."); }
    public void unlock() { System.out.println("BrandALock unlocked."); }
}
