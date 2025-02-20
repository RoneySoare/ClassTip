package HardCodedDependencies;

public class HardCodedDependenciesF {
    public static void main(String[] args) {
        Report report = new Report(new PDFReportGenerator());
        report.generateReport();
    }
}

interface ReportGenerator {
    void generateReport();
}

class PDFReportGenerator implements ReportGenerator {
    public void generateReport() {
        System.out.println("Generating PDF Report...");
    }
}

class ExcelReportGenerator implements ReportGenerator {
    public void generateReport() {
        System.out.println("Generating Excel Report...");
    }
}

class Report {
    private ReportGenerator reportGenerator;

    public Report(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.generateReport();
    }
}
