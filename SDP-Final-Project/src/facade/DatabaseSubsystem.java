package facade;

public class DatabaseSubsystem {
    public String registerStudentRecord(String studentName, String gradeLevel) {
        String generatedId = "STU-" + Math.abs(studentName.hashCode() % 10000);
        System.out.printf("[Database] Created record for %s (Grade: %s) -> ID: %s%n",
                studentName, gradeLevel, generatedId);
        return generatedId;
    }
}