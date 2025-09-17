package devices;

import java.io.IOException;

public class BrandBLock extends AbstractLock {
    @Override
    protected double readUsageFromFile() throws IOException {
        // Simulated external DB/file for Brand B lock
        return readDoubleFromFile("data/brandB_lock.txt");
    }
}
