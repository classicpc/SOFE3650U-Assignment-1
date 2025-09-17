package devices;

public interface Lock {
    void lock();
    void unlock();
    double getBatteryConsumption();
    void setBatteryConsumption(double percentPerMonth);
}
