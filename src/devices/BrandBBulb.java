package devices;

import java.io.IOException;

public class BrandBBulb extends AbstractBulb {
    @Override
    protected double readUsageFromFile() throws IOException {
        // Simulated external DB/file for Brand B bulb
        return readDoubleFromFile("data/brandB_bulb.txt");
    }
}
