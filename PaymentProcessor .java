// Interface for abstraction
interface PaymentGateway {
    void authenticateUser();
    void makePayment(double amount);
    void generateReceipt();
}

// Implementation 1: Credit Card Payment
