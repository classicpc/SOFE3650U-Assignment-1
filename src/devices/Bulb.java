package devices;

// Interface for smart bulbs
public interface Bulb {
    void turnOn(); // turns the bulb on
    void turnOff(); // turns the bulb off
    double getPowerUsage(); // returns power usage
    void setPowerUsage(double watts); // sets power usage
}
