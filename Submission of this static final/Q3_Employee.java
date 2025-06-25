public class Q3_Employee {
    static String companyName = "Microsoft";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    public Q3_Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Q3_Employee emp1 = new Q3_Employee("Vipul", 1, "CEO");
        
        if (emp1mp1 instanceof Q3_Employee) {
            ((Q3_Employee) emp1).displayDetails();
        }
        Q3_Employee.displayTotalEmployees();
    }
}
