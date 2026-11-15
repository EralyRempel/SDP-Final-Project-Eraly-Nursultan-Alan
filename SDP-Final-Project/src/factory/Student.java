package factory;

public class Student implements User {
    private final String id;
    private final String name;
    private final String gradeClass;

    public Student(String id, String name, String gradeClass) {
        this.id = id;
        this.name = name;
        this.gradeClass = gradeClass;
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
        return "Student (" + gradeClass + ")";
    }

    @Override
    public void displayDashboard() {
        System.out.println("[Student Portal] Welcome, " + name + "! Class: " + gradeClass);
    }
}
