package observer;

public class StudentObserver implements Observer {
    private String name;

    public StudentObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for student " + name + ": new grade has been posted" + message);
    }
}