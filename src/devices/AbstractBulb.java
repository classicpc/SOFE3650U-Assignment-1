package devices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Template for bulbs. configureUsage() is implemented here and calls the
 * factory method readUsageFromFile() which concrete bulbs override.
 */
public abstract class AbstractBulb implements Bulb {
    protected double powerUsage = 0.0; // in watts

    @Override
    public void configureUsage() {
        try {
            powerUsage = readUsageFromFile();
            System.out.println(getClass().getSimpleName() + " - power usage set to " + powerUsage + " W");
        } catch (IOException e) {
            System.err.println("Failed to configure usage for " + getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    @Override
    public double getPowerUsage() {
        return powerUsage;
    }

    protected abstract double readUsageFromFile() throws IOException;

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " turned off.");
    }

    // helper utility
    protected double readDoubleFromFile(String path) throws IOException {
        String s = Files.readString(Path.of(path)).trim();
        return Double.parseDouble(s);
    }
}
