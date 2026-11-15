import adapter.BankPaymentAdapter;
import adapter.LegacyBankService;
import adapter.PaymentProcessor;
import facade.SchoolEnrollmentFacade;

import factory.User;
import factory.UserFactory;
import bridge.MessageSender;
import bridge.EmailSender;
import bridge.SmsSender;
import bridge.Notification;
import bridge.AcademicNotification;
import bridge.EmergencyNotification;

import observer.GradeBook;
import observer.StudentObserver;
import strategy.CourseEvaluator;
import strategy.GradingStrategy;
import strategy.WeightedGradingStrategy;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SCHOOL MANAGEMENT SYSTEM - FULL PROJECT DEMO ===\n");

        System.out.println("--- 1. ADAPTER & FACADE DEMO ---");
        demoAdapterAndFacade();

        System.out.println("\n----------------------------------------\n");

        System.out.println("--- 2. FACTORY & BRIDGE DEMO (MY PART) ---");
        demoFactoryAndBridge();

        System.out.println("\n----------------------------------------\n");

        System.out.println("--- 3. OBSERVER & STRATEGY DEMO ---");
        demoObserverAndStrategy();
        
        System.out.println("\n=== ALL 6 DESIGN PATTERNS EXECUTED SUCCESSFULLY ===");
    }

    private static void demoAdapterAndFacade() {
        SchoolEnrollmentFacade enrollmentFacade = new SchoolEnrollmentFacade();
        String studentId = enrollmentFacade.enrollStudent("Alan Beisen", "10-A");

        System.out.println();

        LegacyBankService legacyBank = new LegacyBankService();
        PaymentProcessor paymentProcessor = new BankPaymentAdapter(legacyBank, "USD");

        boolean isPaid = paymentProcessor.processPayment(studentId, 250.50);
        System.out.println("Tuition payment status: " + (isPaid ? "SUCCESS" : "FAILED"));
    }

    private static void demoFactoryAndBridge() {
        UserFactory userFactory = new UserFactory();
        User student = userFactory.createUser("student", "ST-101", "Alikhan", "10-A");
        User teacher = userFactory.createUser("teacher", "TC-202", "Mr. Smith", "Computer Science");

        student.displayDashboard();
        teacher.displayDashboard();

        System.out.println();

        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        Notification academicAlert = new AcademicNotification(emailSender);
        academicAlert.notifyUser(student.getName(), "Your grade for Java Programming has been updated to A.");

        Notification emergencyAlert = new EmergencyNotification(smsSender);
        emergencyAlert.notifyUser(teacher.getName(), "Staff meeting scheduled in room 302.");
    }

    private static void demoObserverAndStrategy() {
        GradingStrategy strategy = new WeightedGradingStrategy();
        CourseEvaluator evaluator = new CourseEvaluator(strategy);
        double finalScore = evaluator.evaluate(List.of(85.0, 90.0, 95.0));
        System.out.println("[Strategy] Calculated final course grade: " + finalScore);

        GradeBook gradeBook = new GradeBook();
        StudentObserver observer = new StudentObserver("Alikhan");
        gradeBook.attach(observer);
        
        gradeBook.addGrade("Mathematics exam score: 95/100");
    }
}
