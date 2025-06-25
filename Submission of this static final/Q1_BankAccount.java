public class Q1_BankAccount {
    static String bankName = "HDFC Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    public Q1_BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        Q1_BankAccount acc1 = new Q1_BankAccount("Vipul", 1001);
        Q1_BankAccount acc2 = new Q1_BankAccount("Tej", 1002);
        if (acc1 instanceof Q1_BankAccount) {
            ((Q1_BankAccount) acc1).displayDetails();
        }
        if (acc2 instanceof Q1_BankAccount) {
            ((Q1_BankAccount) acc2).displayDetails();
        }
        System.out.println("Total Accounts: " + Q1_BankAccount.getTotalAccounts());
    }
}
