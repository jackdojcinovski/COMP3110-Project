package testcases.p26;

public class OrderProcessor {

    private int processed;
    private int failed;

    public OrderProcessor() {
        this.processed = 0;
        this.failed = 0;
    }

    public void processOrder(String id) {
        System.out.println("Processing order: " + id);
        if (id == null || id.isEmpty()) {
            System.out.println("Invalid id");
            failed++;
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

    public void printSummary() {
        System.out.println("Processed: " + processed);
        System.out.println("Failed: " + failed);
    }
}
