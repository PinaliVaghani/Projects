package Inheritance;

public class Assigment {
    private String name;
    private int age;

    public Assigment(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public final String getType() {
        return "Person";
    }
}

// Subclass: Student
class Student extends Assigment{
    private String studentId;
    private String course;
    private double gpa;

    public Student(String name, int age, String studentId, String course, double gpa) {
        super("", 0); // Avoid calling the superclass constructor directly
        setName(name);
        setAge(age);
        this.studentId = studentId;
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Course: " + course + ", GPA: " + gpa);
    }
}

// Subclass: Professor
class Professor extends Assigment {
    private String employeeId;
    private String department;
    private double salary;

    public Professor(String name, int age, String employeeId, String department, double salary) {
        super("", 0);
        setName(name);
        setAge(age);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId + ", Department: " + department + ", Salary: " + salary);
    }
}

// Subclass: DepartmentHead
class DepartmentHead extends Professor {
    private String officeRoom;

    public DepartmentHead(String name, int age, String employeeId, String department, double salary, String officeRoom) {
        super(name, age, employeeId, department, salary);
        this.officeRoom = officeRoom;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Room: " + officeRoom);
    }
}

// University Class
class University {
    private static String universityName;
    private static int totalStudents = 0;
    private static int totalProfessors = 0;

    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static void incrementStudentCount() {
        totalStudents++;
    }

    public static void incrementProfessorCount() {
        totalProfessors++;
    }

    public static String getStatistics() {
        return "University Name: " + universityName + ", Total Students: " + totalStudents + ", Total Professors: " + totalProfessors;
    }
}


