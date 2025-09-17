package devices;

public class BrandAFactory extends DeviceFactory {
    @Override
    protected String brandName() { return "BrandA"; }

    @Override
    protected Bulb makeBulb() { return new BrandABulb(0.0); }

    @Override
    protected Lock makeLock() { return new BrandALock(0.0); }
}
