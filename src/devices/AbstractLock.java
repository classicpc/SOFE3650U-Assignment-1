package devices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Template for locks. configureUsage() is implemented here and calls the
 * factory method readUsageFromFile() which concrete locks override.
 */
public abstract class AbstractLock implements Lock {
    protected double batteryConsumption = 0.0; // in percentage per month (example)

    @Override
    public void configureUsage() {
        try {
            batteryConsumption = readUsageFromFile();
            System.out.println(getClass().getSimpleName() + " - battery consumption set to " + batteryConsumption + " %/month");
        } catch (IOException e) {
            System.err.println("Failed to configure usage for " + getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public double getBatteryConsumption() {
        return batteryConsumption;
    }

    protected abstract double readUsageFromFile() throws IOException;

    @Override
    public void lock() {
        System.out.println(getClass().getSimpleName() + " locked.");
    }

    @Override
    public void unlock() {
        System.out.println(getClass().getSimpleName() + " unlocked.");
    }

    // helper utility
    protected double readDoubleFromFile(String path) throws IOException {
        String s = Files.readString(Path.of(path)).trim();
        return Double.parseDouble(s);
    }
}
