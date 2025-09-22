package devices;

// Factory for Brand B devices
public class BrandBFactory extends DeviceFactory {
    @Override
    protected String brandName() { return "BrandB"; } // returns brand name

    @Override
    protected Bulb makeBulb() { return new BrandBBulb(0.0); } // makes Brand B bulb

    @Override
    protected Lock makeLock() { return new BrandBLock(0.0); } // makes Brand B lock
}
