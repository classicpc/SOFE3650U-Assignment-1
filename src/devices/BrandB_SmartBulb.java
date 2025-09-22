package devices;

// Brand B's implementation of a smart bulb (renamed to BrandB_SmartBulb)
public class BrandB_SmartBulb implements SmartBulb {
    private float powerUsage; // stores power usage

    public BrandB_SmartBulb(float initialPowerUsage) { this.powerUsage = initialPowerUsage; } // constructor

    @Override
    public void setPowerUsage(float x) { this.powerUsage = x; } // set power usage

    @Override
    public float getPowerUsage() { return powerUsage; } // get power usage

    // Added for test output
    public void turnOn() { System.out.println("BrandBBulb turned on."); }
    public void turnOff() { System.out.println("BrandBBulb turned off."); }
}
