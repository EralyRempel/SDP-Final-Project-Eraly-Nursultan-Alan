package bridge;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String recipient, String subject, String body) {
        System.out.printf("[EMAIL] To: %s | Subject: %s | Body: %s%n", recipient, subject, body);
    }
}
