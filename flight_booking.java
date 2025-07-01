import java.util.*;
public class flight_booking {
    static String[] flights = {
        "Delhi to Mumbai",
        "Mumbai to Kolkata",
        "Chennai to Delhi",
        "Bangalore to Hyderabad",
        "Kolkata to Chennai"
    };
    static List<String> bookings = new ArrayList<>();
    public static void searchFlight(String query) {
        boolean found = false;
        System.out.println("Searched-Flights");
        for (String flight : flights) {
            if (flight.toLowerCase().contains(query.toLowerCase())) {
                System.out.println("- " + flight);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching flights found.");
        }
    }
    public static void bookFlight(String flightName, String passengerName) {
        boolean exists = false;
        for (String flight : flights) {
            if (flight.equals(flightName)) {
                bookings.add(passengerName + " booked " + flight);
                System.out.println("Booking successful!");
                exists = true;
                break;
            }
        }
        if (!exists) {
            System.out.println("Flight not found. Booking failed.");
        }
    }
    public static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            System.out.println("Your Bookings:");
            for (String booking : bookings) {
                System.out.println("- " + booking);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Search your flight-");
                    String query = sc.nextLine();
                    searchFlight(query);
                    break;
                case 2:
                    System.out.print("Enter full flight name: ");
                    String flightName = sc.nextLine();
                    System.out.print("Enter your name: ");
                    String passengerName = sc.nextLine();
                    bookFlight(flightName, passengerName);
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using the Flight Booking System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

