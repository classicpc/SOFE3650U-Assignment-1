package devices;

public class BrandBFactory extends DeviceFactory {
    @Override
    protected String brandName() { return "BrandB"; }

    @Override
    protected Bulb makeBulb() { return new BrandBBulb(0.0); }

    @Override
    protected Lock makeLock() { return new BrandBLock(0.0); }
}
