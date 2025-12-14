public package testcases.p26;

public class OrderProcessor {

    private int processed;
    private int failed;
    private int skipped;

    public OrderProcessor() {
        this.processed = 0;
        this.failed = 0;
        this.skipped = 0;
    }

    public void processOrder(String id) {
        System.out.println("Processing order: " + id);
        if (id == null || id.isEmpty()) {
            System.out.println("Invalid id");
            failed++;
            return;
        }
        if (id.startsWith("TEST-")) {
            System.out.println("Skipping test order");
            skipped++;
            return;
        }
        processed++;
    }

    public int getProcessed() {
        return processed;
    }

    public int getFailed() {
        return failed;
    }

    public int getSkipped() {
        return skipped;
    }

    public void printSummary() {
        System.out.println("Processed: " + processed);
        System.out.println("Failed: " + failed);
        System.out.println("Skipped: " + skipped);
    }
}
 {
    
}
