package devices;

// Brand B's implementation of a smart lock (renamed to BrandB_SmartLock)
public class BrandB_SmartLock implements SmartLock {
    private float batteryUsage; // stores battery usage

    public BrandB_SmartLock(float initialBatteryUsage) { this.batteryUsage = initialBatteryUsage; } // constructor

    @Override
    public void setBatteryUsage(float x) { this.batteryUsage = x; } // set battery usage

    @Override
    public float getBatteryUsage() { return batteryUsage; } // get battery usage

    // Added for test output
    public void lock() { System.out.println("BrandBLock locked."); }
    public void unlock() { System.out.println("BrandBLock unlocked."); }
}
