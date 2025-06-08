// Interface for abstraction
interface PaymentGateway {
    void authenticateUser();
    void makePayment(double amount);
    void generateReceipt();
}

// Implementation 1: Credit Card Payment
class CreditCardPayment implements PaymentGateway {
    public void authenticateUser() {
        System.out.println("Authenticating Credit Card user via OTP...");
    }

    public void makePayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }

    public void generateReceipt() {
        System.out.println("Receipt: Credit Card payment successful.\n");
    }
}

// Implementation 2: PayPal Payment
class PayPalPayment implements PaymentGateway {
    public void authenticateUser() {
        System.out.println("Redirecting to PayPal login page...");
    }

    public void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    public void generateReceipt() {
        System.out.println("Receipt: PayPal payment successful.\n");
    }
}

// Implementation 3: UPI Payment
class UpiPayment implements PaymentGateway {
    public void authenticateUser() {
        System.out.println("Authenticating using UPI PIN...");
    }

    public void makePayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }

    public void generateReceipt() {
        System.out.println("Receipt: UPI payment successful.\n");
    }
}

// Business logic using abstraction
public class PaymentProcessor {
    public void processPayment(PaymentGateway gateway, double amount) {
        gateway.authenticateUser();
        gateway.makePayment(amount);
        gateway.generateReceipt();
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Process Credit Card payment
        PaymentGateway creditCard = new CreditCardPayment();
        processor.processPayment(creditCard, 250.75);

        // Process PayPal payment
        PaymentGateway paypal = new PayPalPayment();
        processor.processPayment(paypal, 100.00);

        // Process UPI payment
        PaymentGateway upi = new UpiPayment();
        processor.processPayment(upi, 50.25);
    }
}
