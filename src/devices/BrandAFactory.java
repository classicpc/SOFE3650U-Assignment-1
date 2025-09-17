package devices;

public class BrandAFactory implements SmartDeviceFactory {

    @Override
    public Bulb createBulb() {
        return new BrandABulb();
    }

    @Override
    public Lock createLock() {
        return new BrandALock();
    }
}
