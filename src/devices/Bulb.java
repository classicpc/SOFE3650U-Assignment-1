package devices;

public interface Bulb {
    void configureUsage();        // sets power usage (reads from data file)
    double getPowerUsage();
    void turnOn();
    void turnOff();
}
