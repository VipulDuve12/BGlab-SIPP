public class Q5_Student {
    static String universityName = "IIT BOMBAY";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    public Q5_Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Q5_Student student1 = new Q5_Student("Vipul", 2000, "A");
        if (student1 instanceof Q5_Student) {
            ((Q5_Student) student1).displayDetails();
        }
        Q5_Student.displayTotalStudents();
    }
}
