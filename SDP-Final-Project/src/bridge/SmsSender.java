package bridge;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String recipient, String subject, String body) {
        System.out.printf("[SMS] To: %s | [%s]: %s%n", recipient, subject, body);
    }
}
