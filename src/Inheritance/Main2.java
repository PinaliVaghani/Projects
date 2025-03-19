package Inheritance;

public class Main2 {
    public static void main(String[] args) {
        // Set university name
        University.setUniversityName("Global University");

        // Create an array of Person references
        Assigment[] people = new Assigment[4];

        // Add Students, Professors, and DepartmentHead objects
        people[0] = new Student("Alice", 20, "S123", "Computer Science", 3.8);
        University.incrementStudentCount();

        people[1] = new Professor("Dr. Smith", 45, "P456", "Mathematics", 75000);
        University.incrementProfessorCount();

        people[2] = new Student("Bob", 22, "S789", "Physics", 3.6);
        University.incrementStudentCount();

        people[3] = new DepartmentHead("Dr. Johnson", 50, "P987", "Engineering", 90000, "Room 101");
        University.incrementProfessorCount();

        // Display information using polymorphism
        for (Assigment person : people) {
            person.displayInfo();
            System.out.println();
        }

        // Display university statistics
        System.out.println(University.getStatistics());
    }

}

