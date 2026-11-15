package adapter;

public interface PaymentProcessor {
    boolean processPayment(String studentId, double amountInDollars);
}