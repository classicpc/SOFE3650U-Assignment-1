package devices;

// Brand B's implementation of a smart bulb
public class BrandBBulb implements Bulb {
    private double powerUsage; // stores power usage

    public BrandBBulb(double initialPowerUsage) { this.powerUsage = initialPowerUsage; } // constructor

    @Override
    public void turnOn() { System.out.println("BrandBBulb turned on."); } // print on

    @Override
    public void turnOff() { System.out.println("BrandBBulb turned off."); } // print off

    @Override
    public double getPowerUsage() { return powerUsage; } // get power usage

    @Override
    public void setPowerUsage(double watts) { this.powerUsage = watts; } // set power usage
}
