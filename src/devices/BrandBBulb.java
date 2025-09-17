package devices;

public class BrandBBulb implements Bulb {
    private double powerUsage;

    public BrandBBulb(double initialPowerUsage) { this.powerUsage = initialPowerUsage; }

    @Override
    public void turnOn() { System.out.println("BrandBBulb turned on."); }

    @Override
    public void turnOff() { System.out.println("BrandBBulb turned off."); }

    @Override
    public double getPowerUsage() { return powerUsage; }

    @Override
    public void setPowerUsage(double watts) { this.powerUsage = watts; }
}
