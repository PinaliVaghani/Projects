package Dec18;

public class Student {
    String name;
    int age;
    String grade;
    String course;

    public Student(){
        System.out.println("this should call constructor 1");
    }

    public Student(String name) {
        this.name = name;
        System.out.println("this should call constructor 2");
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("this should call constructor 3");
    }

    public Student(String name, int age, String grade, String course) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.course = course;
        System.out.println("this should call constructor 2");
    }
}
