public class Q6_Vehicle {
    static double registrationFee = 2000;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Q6_Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        Q6_Vehicle vehicle1 = new Q6_Vehicle("Vipul", "Car", "VD1D2Q456");
        if (vehicle1 instanceof Q6_Vehicle) {
            ((Q6_Vehicle) vehicle1).displayDetails();
        }
        Q6_Vehicle.updateRegistrationFee(10000.0);
        System.out.println("Updated Registration Fee: " + registrationFee);
    }
}
