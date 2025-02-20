package OpenClosedViolation;

public class OpenClosedViolationF {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Discount for Regular: " + calculator.calculateDiscount(new RegularCustomer(), 200));
        System.out.println("Discount for VIP: " + calculator.calculateDiscount(new VIPCustomer(), 200));
    }
}

interface Customer {
    double calculateDiscount(double amount);
}

class RegularCustomer implements Customer {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}

class VIPCustomer implements Customer {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.2;
    }
}

class DiscountCalculator {
    public double calculateDiscount(Customer customer, double amount) {
        return customer.calculateDiscount(amount);
    }
}
