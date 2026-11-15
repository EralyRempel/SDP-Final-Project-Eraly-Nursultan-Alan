package factory;

public class Teacher implements User {
    private final String id;
    private final String name;
    private final String subject;

    public Teacher(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Teacher (" + subject + ")";
    }

    @Override
    public void displayDashboard() {
        System.out.println("[Teacher Portal] Welcome, Prof. " + name + "! Managing subject: " + subject);
    }
}
