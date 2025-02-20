package GodClassViolation;

public class GodClassViolationF {
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}

class Application {
    private Authenticator authenticator;
    private DashboardLoader dashboardLoader;
    private PaymentProcessor paymentProcessor;
    private ReportGenerator reportGenerator;

    public Application() {
        authenticator = new Authenticator();
        dashboardLoader = new DashboardLoader();
        paymentProcessor = new PaymentProcessor();
        reportGenerator = new ReportGenerator();
    }

    public void run() {
        System.out.println("Running application...");
        authenticator.authenticateUser();
        dashboardLoader.loadDashboard();
        paymentProcessor.processPayments();
        reportGenerator.generateReports();
    }
}

class Authenticator {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}

class DashboardLoader {
    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }
}

class PaymentProcessor {
    public void processPayments() {
        System.out.println("Processing payments...");
    }
}

class ReportGenerator {
    public void generateReports() {
        System.out.println("Generating reports...");
    }
}
