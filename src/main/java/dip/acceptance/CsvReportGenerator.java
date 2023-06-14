package dip.acceptance;

public class CsvReportGenerator implements ReportGenerator {

    @Override
    public void generate() {
        System.out.println("CSV report generated");
    }
}
