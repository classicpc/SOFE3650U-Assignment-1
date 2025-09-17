package devices;

public class TestDriver {
    public static void main(String[] args) {
        DeviceFactory fa = new BrandAFactory();
        DeviceFactory fb = new BrandBFactory();

        Bulb aBulb = fa.createBulbWithUsage();
        Lock aLock = fa.createLockWithUsage();

        System.out.println("Demo: Brand A devices");
        aBulb.turnOn();
        System.out.println("Power: " + aBulb.getPowerUsage() + " W");
        aBulb.turnOff();

        aLock.lock();
        System.out.println("Battery %/month: " + aLock.getBatteryConsumption());
        aLock.unlock();
    }
}
