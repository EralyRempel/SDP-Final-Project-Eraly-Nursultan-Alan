package facade;

public class LibrarySubsystem {
    public void issueLibraryCard(String studentId, String studentName) {
        System.out.printf("[Library] Issued digital library card and textbook kit for %s (%s)%n",
                studentName, studentId);
    }
}