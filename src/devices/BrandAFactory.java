package devices;

// Factory for Brand A devices (implements SmartDeviceFactory)
public class BrandAFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createSmartBulb() {
        return new BrandA_SmartBulb(0.0f);
    }

    @Override
    public SmartLock createSmartLock() {
        return new BrandA_SmartLock(0.0f);
    }
}
