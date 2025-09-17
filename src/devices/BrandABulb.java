package devices;

import java.io.IOException;

/**
 * Concrete Brand A Bulb. Implements the factory method readUsageFromFile()
 * to fetch Brand A bulb power (simulated external DB via data file).
 */
public class BrandABulb extends AbstractBulb {
    @Override
    protected double readUsageFromFile() throws IOException {
        // Simulated external DB/file for Brand A bulb
        return readDoubleFromFile("data/brandA_bulb.txt");
    }
}
