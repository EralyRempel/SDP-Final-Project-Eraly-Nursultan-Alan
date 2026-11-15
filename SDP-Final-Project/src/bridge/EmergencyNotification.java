package bridge;

public class EmergencyNotification extends Notification {
    public EmergencyNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String recipient, String message) {
        sender.sendMessage(recipient, "URGENT SCHOOL ALERT", message.toUpperCase());
    }
}
