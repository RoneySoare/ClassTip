package ImproperExceptionHandling;

public class ImproperExceptionHandlingF {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}

class Calculator {
    public void divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
