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

