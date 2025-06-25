public class Q4_Product {
    static double discount = 20; 
    final int productID;
    String productName;
    double price;
    int quantity;

    public Q4_Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Q4_Product prod1 = new Q4_Product(101, "IPhone", 100000, 4);
        if (prod1 instanceof Q4_Product) {
            ((Q4_Product) prod1).displayDetails();
        }
        Q4_Product.updateDiscount(15.0);
        System.out.println("Updated Discount: " + discount + "%");
    }
}
