package devices;

public interface Bulb {
    void turnOn();
    void turnOff();
    double getPowerUsage();
    void setPowerUsage(double watts);
}
