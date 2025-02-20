package InterfaceSegregationViolation;

public class InterfaceSegregationViolationF {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        printer.print();

        Scanner scanner = new ScannerImpl();
        scanner.scan();

        FaxMachine faxMachine = new FaxMachineImpl();
        faxMachine.fax();
    }
}

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface FaxMachine {
    void fax();
}

class PrinterImpl implements Printer {
    public void print() {
        System.out.println("Printing...");
    }
}

class ScannerImpl implements Scanner {
    public void scan() {
        System.out.println("Scanning...");
    }
}

class FaxMachineImpl implements FaxMachine {
    public void fax() {
        System.out.println("Faxing...");
    }
}
