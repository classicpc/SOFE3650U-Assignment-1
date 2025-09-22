package devices;

// Abstract factory interface for smart devices (matches UML: SmartDeviceFactory)
public interface SmartDeviceFactory {
    SmartBulb createSmartBulb(); // creates a smart bulb
    SmartLock createSmartLock(); // creates a smart lock
}
