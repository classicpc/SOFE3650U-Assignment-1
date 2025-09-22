package devices;

// Brand A's implementation of a smart bulb (renamed to BrandA_SmartBulb)
public class BrandA_SmartBulb implements SmartBulb {
    private float powerUsage; // stores power usage

    public BrandA_SmartBulb(float initialPowerUsage) { this.powerUsage = initialPowerUsage; } // constructor

    @Override
    public void setPowerUsage(float x) { this.powerUsage = x; } // set power usage

    @Override
    public float getPowerUsage() { return powerUsage; } // get power usage

    // Added for test output
    public void turnOn() { System.out.println("BrandABulb turned on."); }
    public void turnOff() { System.out.println("BrandABulb turned off."); }
}
