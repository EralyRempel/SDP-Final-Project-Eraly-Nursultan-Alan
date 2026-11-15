package factory;

public class UserFactory {
    public User createUser(String type, String id, String name, String extraInfo) {
        if (type == null) {
            throw new IllegalArgumentException("User type cannot be null");
        }

        switch (type.toLowerCase()) {
            case "student":
                return new Student(id, name, extraInfo);
            case "teacher":
                return new Teacher(id, name, extraInfo);
            default:
                throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}
