package facade;

public class ScheduleSubsystem {
    public void assignTimetable(String studentId, String gradeLevel) {
        System.out.printf("[Schedule] Assigned standard %s timetable to student %s%n",
                gradeLevel, studentId);
    }
}