package devices;

// Interface for smart locks
public interface Lock {
    void lock(); // locks the device
    void unlock(); // unlocks the device
    double getBatteryConsumption(); // returns battery usage
    void setBatteryConsumption(double percentPerMonth); // sets battery usage
}
