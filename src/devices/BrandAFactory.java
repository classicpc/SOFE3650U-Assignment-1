package devices;

// Factory for Brand A devices
public class BrandAFactory extends DeviceFactory {
    @Override
    protected String brandName() { return "BrandA"; } // returns brand name

    @Override
    protected Bulb makeBulb() { return new BrandABulb(0.0); } // makes Brand A bulb

    @Override
    protected Lock makeLock() { return new BrandALock(0.0); } // makes Brand A lock
}
