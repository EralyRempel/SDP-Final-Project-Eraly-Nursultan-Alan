# School Management System
## Software Design Patterns — Final Project

### 1. Project Overview

The **School Management System** is a Java-based academic project developed to demonstrate the practical implementation of six software design patterns.

The project simulates several operations within an educational institution, including student enrollment, user management, grade evaluation, notifications, and tuition payment processing.

Each design pattern addresses a specific software design problem and demonstrates how object-oriented programming principles can improve code organization, flexibility, and maintainability.


### 2. Group

 - SE-2512

### 2.1 Team Members

- Eraly Rempel 
- Nursultan Sabidaudanov
- Alan Beisen



### 3. Technologies Used

- **Programming Language:** Java
- **JDK:** Java 9 or higher
- **IDE:** IntelliJ IDEA
- **Concepts:** Object-Oriented Programming (OOP), Software Design Patterns

### 4. Implemented Design Patterns

The project implements six design patterns:

| Design Pattern | Implementation | Purpose |
|---|---|---|
| Factory | `UserFactory` | Creates different user types, including Students and Teachers. |
| Observer | `GradeBook`, `StudentObserver` | Notifies students when new grade information is published. |
| Strategy | `CourseEvaluator`, `GradingStrategy` | Supports different grading algorithms. |
| Facade | `SchoolEnrollmentFacade` | Simplifies student enrollment by coordinating multiple subsystems. |
| Bridge | `Notification`, `MessageSender` | Separates notification types from delivery methods such as Email and SMS. |
| Adapter | `BankPaymentAdapter` | Connects the application's payment interface to a legacy banking service. |

### 5. Project Structure

```text
School-Management-System/
│
├── adapter/
│   ├── BankPaymentAdapter.java
│   ├── LegacyBankService.java
│   └── PaymentProcessor.java
│
├── facade/
│   ├── BillingSubsystem.java
│   ├── DatabaseSubsystem.java
│   ├── LibrarySubsystem.java
│   ├── ScheduleSubsystem.java
│   └── SchoolEnrollmentFacade.java
│
├── factory/
│   ├── Student.java
│   ├── Teacher.java
│   ├── User.java
│   └── UserFactory.java
│
├── bridge/
│   ├── AcademicNotification.java
│   ├── EmailSender.java
│   ├── EmergencyNotification.java
│   ├── MessageSender.java
│   ├── Notification.java
│   └── SmsSender.java
│
├── observer/
│   ├── GradeBook.java
│   ├── Observer.java
│   ├── StudentObserver.java
│   └── Subject.java
│
├── strategy/
│   ├── CourseEvaluator.java
│   ├── GradingStrategy.java
│   ├── StandardGradingStrategy.java
│   └── WeightedGradingStrategy.java
│
└── Main.java
```

### 6. Application Demonstration

The `Main.java` class serves as the entry point of the project and demonstrates all six implemented design patterns.

The demonstration consists of three main sections.

**Part 1 — Adapter and Facade**

- Creates a school enrollment facade.
- Enrolls a student named Alan Beisen in class 10-A.
- Processes a tuition payment of $250.50 using the BankPaymentAdapter.
- Displays the payment result.

**Part 2 — Factory and Bridge**

- Creates a Student and a Teacher using UserFactory.
- Displays their respective dashboards.
- Demonstrates academic notifications through EmailSender.
- Demonstrates emergency notifications through SmsSender.

**Part 3 — Observer and Strategy**

- Uses WeightedGradingStrategy to calculate a final course grade.
- Creates a GradeBook.
- Registers a StudentObserver.
- Publishes new grade information and notifies the observer.

### 7. How to Run the Project

**Requirements:**
- Install JDK 9 or higher.
- Clone or download the repository.
- Open the project in IntelliJ IDEA or use a terminal.

**Step 1. Compile the source files**

From the project root directory:

Windows PowerShell:

```powershell
New-Item -ItemType Directory -Force out
$files = Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d out $files
```

macOS / Linux:

```bash
mkdir -p out
javac -d out $(find . -name "*.java")
```

**Step 2. Run the application**

```bash
java -cp out Main
```

### 8. Expected Output

When the application runs successfully, it displays three demonstration sections:

1. Adapter and Facade demonstration.
2. Factory and Bridge demonstration.
3. Observer and Strategy demonstration.

The program finishes with the following confirmation message:

```text
=== ALL 6 DESIGN PATTERNS EXECUTED SUCCESSFULLY ===
```

### 9. Project Objectives

The main objectives of this project are:

- To understand and implement six software design patterns.
- To apply object-oriented programming principles in Java.
- To demonstrate practical solutions to common software design problems.
- To improve code reusability, flexibility, and maintainability.
- To understand how different design patterns can work together in one system.

### 10. Future Improvements

Possible future improvements include:

- Implementing a graphical user interface.
- Integrating a real database.
- Adding automated unit tests.
- Implementing real email and SMS notification services.
- Connecting the payment system to an actual payment provider.
- Adding authentication and role-based access control.

### 11. Conclusion

This project demonstrates how six different software design patterns can be applied to a School Management System.

Each pattern provides a solution to a specific design problem, while their combined implementation demonstrates how modular and maintainable software can be developed using Java and object-oriented programming principles.

The project provides practical examples of Factory, Observer, Strategy, Facade, Bridge, and Adapter patterns.
