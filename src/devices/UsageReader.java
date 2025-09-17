package devices;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class UsageReader {
    private static final String USAGE_FILE = "data/usage.csv";
    private static final double DEFAULT_BULB_USAGE = 5.0;
    private static final double DEFAULT_LOCK_USAGE = 1.0;

    public static double getUsageFor(String brand, String deviceType) {
        try {
            Path path = Paths.get(USAGE_FILE);
            if (!Files.exists(path)) {
                System.err.println("UsageReader: file not found: " + USAGE_FILE);
                return defaultFor(deviceType);
            }

            List<String> lines = Files.readAllLines(path);
            for (String raw : lines) {
                String line = raw.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;
                String[] parts = line.split(",");
                if (parts.length < 3) continue;
                String b = parts[0].trim();
                String t = parts[1].trim().toLowerCase();
                String v = parts[2].trim();
                if (b.equalsIgnoreCase(brand) && t.equalsIgnoreCase(deviceType)) {
                    try { return Double.parseDouble(v); }
                    catch (NumberFormatException e) { return defaultFor(deviceType); }
                }
            }
            return defaultFor(deviceType);
        } catch (IOException e) {
            return defaultFor(deviceType);
        }
    }

    private static double defaultFor(String deviceType) {
        if ("bulb".equalsIgnoreCase(deviceType)) return DEFAULT_BULB_USAGE;
        if ("lock".equalsIgnoreCase(deviceType)) return DEFAULT_LOCK_USAGE;
        return 0.0;
    }
}
