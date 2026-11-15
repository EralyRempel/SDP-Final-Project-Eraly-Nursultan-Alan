import adapter.BankPaymentAdapter;
import adapter.LegacyBankService;
import adapter.PaymentProcessor;
import facade.SchoolEnrollmentFacade;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ADAPTER & FACADE DEMO ===");
        demoAdapterAndFacade();

        // Сюда одногруппники добавят вызовы своих методов:
        // demoObserverAndStrategy();
        // demoFactoryAndBridge();
    }

    private static void demoAdapterAndFacade() {
        // 1. Facade Pattern: enroll a new student across 4 subsystems with one call
        SchoolEnrollmentFacade enrollmentFacade = new SchoolEnrollmentFacade();
        String studentId = enrollmentFacade.enrollStudent("Alan Beisen", "10-A");

        System.out.println();

        // 2. Adapter Pattern: pay school tuition using an incompatible legacy bank API
        LegacyBankService legacyBank = new LegacyBankService();
        PaymentProcessor paymentProcessor = new BankPaymentAdapter(legacyBank, "USD");

        boolean isPaid = paymentProcessor.processPayment(studentId, 250.50);
        System.out.println("Tuition payment status: " + (isPaid ? "SUCCESS" : "FAILED"));
    }
}
