package dip.violation;

public class ReportManager {

    private final String jsonData;

    public ReportManager(String jsonData) {
        this.jsonData = jsonData;
    }

    public void process() {
        generateXmlReport();
        closingActions();
    }

    private void generateXmlReport() {
        XmlReportGenerator reportGenerator = new XmlReportGenerator(jsonData);
        reportGenerator.generate();
    }

    private void closingActions() {
        System.out.println("Closing actions done.");
    }
}
