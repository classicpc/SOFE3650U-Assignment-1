package devices;

public interface Lock {
    void configureUsage();        // sets battery consumption (reads from data file)
    double getBatteryConsumption();
    void lock();
    void unlock();
}
