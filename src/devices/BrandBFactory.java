package devices;

public class BrandBFactory implements SmartDeviceFactory {

    @Override
    public Bulb createBulb() {
        return new BrandBBulb();
    }

    @Override
    public Lock createLock() {
        return new BrandBLock();
    }
}
