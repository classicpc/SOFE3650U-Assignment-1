package devices;

// Brand A's implementation of a smart bulb
public class BrandABulb implements Bulb {
    private double powerUsage; // stores power usage

    public BrandABulb(double initialPowerUsage) { this.powerUsage = initialPowerUsage; } // constructor

    @Override
    public void turnOn() { System.out.println("BrandABulb turned on."); } // print on

    @Override
    public void turnOff() { System.out.println("BrandABulb turned off."); } // print off

    @Override
    public double getPowerUsage() { return powerUsage; } // get power usage

    @Override
    public void setPowerUsage(double watts) { this.powerUsage = watts; } // set power usage
}
