package facade;

import java.util.Objects;

public class SchoolEnrollmentFacade {
    private final DatabaseSubsystem database;
    private final LibrarySubsystem library;
    private final ScheduleSubsystem schedule;
    private final BillingSubsystem billing;

    public SchoolEnrollmentFacade() {
        this(new DatabaseSubsystem(), new LibrarySubsystem(), new ScheduleSubsystem(), new BillingSubsystem());
    }

    public SchoolEnrollmentFacade(DatabaseSubsystem database,
                                  LibrarySubsystem library,
                                  ScheduleSubsystem schedule,
                                  BillingSubsystem billing) {
        this.database = Objects.requireNonNull(database);
        this.library = Objects.requireNonNull(library);
        this.schedule = Objects.requireNonNull(schedule);
        this.billing = Objects.requireNonNull(billing);
    }

    public String enrollStudent(String studentName, String gradeLevel) {
        if (studentName == null || studentName.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be empty");
        }

        System.out.println("Starting enrollment process for: " + studentName);
        String studentId = database.registerStudentRecord(studentName, gradeLevel);
        library.issueLibraryCard(studentId, studentName);
        schedule.assignTimetable(studentId, gradeLevel);
        billing.openCafeteriaAccount(studentId);
        System.out.println("Enrollment completed successfully! Student ID: " + studentId);

        return studentId;
    }
}