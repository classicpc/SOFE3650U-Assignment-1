package devices;

import java.io.IOException;

public class BrandALock extends AbstractLock {
    @Override
    protected double readUsageFromFile() throws IOException {
        // Simulated external DB/file for Brand A lock
        return readDoubleFromFile("data/brandA_lock.txt");
    }
}
