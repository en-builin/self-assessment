package dip.acceptance;

public class ReportManager {

    private final String jsonData;

    public ReportManager(String jsonData) {
        this.jsonData = jsonData;
    }

    public void process(ReportGenerator reportGenerator) {
        reportGenerator.generate();
        closingActions();
    }

    private void closingActions() {
        System.out.println("Closing actions done.");
    }
}
