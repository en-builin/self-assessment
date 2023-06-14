package dip.violation;

public class XmlReportGenerator {


    private final String jsonData;

    public XmlReportGenerator(String jsonData) {
        this.jsonData = jsonData;
    }

    public void generate() {
        System.out.println("XML report generated.");
    }
}
