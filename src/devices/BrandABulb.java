package devices;

public class BrandABulb implements Bulb {
    private double powerUsage;

    public BrandABulb(double initialPowerUsage) { this.powerUsage = initialPowerUsage; }

    @Override
    public void turnOn() { System.out.println("BrandABulb turned on."); }

    @Override
    public void turnOff() { System.out.println("BrandABulb turned off."); }

    @Override
    public double getPowerUsage() { return powerUsage; }

    @Override
    public void setPowerUsage(double watts) { this.powerUsage = watts; }
}
