public class Q7_Patient {
    static String hospitalName = "Mathura Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    public Q7_Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {
        Q7_Patient patient1 = new Q7_Patient(301, "Vipul", 20, "Fever");
        if (patient1 instanceof Q7_Patient) {
            ((Q7_Patient) patient1).displayDetails();
        }
        System.out.println("Total Patients: " + Q7_Patient.getTotalPatients());
    }
}
