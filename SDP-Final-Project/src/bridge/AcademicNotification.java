package bridge;

public class AcademicNotification extends Notification {
    public AcademicNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String recipient, String message) {
        sender.sendMessage(recipient, "Academic Grade Update", message);
    }
}
