package devices;

// Factory for Brand B devices (implements SmartDeviceFactory)
public class BrandBFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createSmartBulb() {
        return new BrandB_SmartBulb(0.0f);
    }

    @Override
    public SmartLock createSmartLock() {
        return new BrandB_SmartLock(0.0f);
    }
}
