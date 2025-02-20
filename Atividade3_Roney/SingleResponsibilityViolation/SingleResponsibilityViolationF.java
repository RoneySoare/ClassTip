package SingleResponsibilityViolation;

public class SingleResponsibilityViolationF {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);
        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice(invoice);

        InvoiceRepository repository = new InvoiceRepository();
        repository.saveToDatabase(invoice);
    }
}

class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice amount: " + invoice.getAmount());
    }
}

class InvoiceRepository {
    public void saveToDatabase(Invoice invoice) {
        System.out.println("Saving invoice to database...");
    }
}
