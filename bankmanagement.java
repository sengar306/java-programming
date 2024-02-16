import java.util.Scanner;

// Define a Bank class
class Bank {
    // Instance variable to store the account balance
    private double amount;

    // Parameterized constructor to initialize the amount with 10000
    public Bank() {
        this.amount = 10000.0;
    }

    // Method to withdraw from the account
    public void withdraw(double withdrawalAmount) {
        // Use ternary operator to check if the withdrawal amount is less than or equal to the current balance
        String message = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient funds";
        
        // If withdrawal is successful, update the balance
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
        
        // Print the message
        System.out.println(message);
    }

    // Method to deposit into the account
    public void deposit(double depositAmount) {
        // Update the balance after deposit
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
}

// Main class to run the program
public class bankmanagement{
    public static void main(String[] args) {
        // Create an object of the Bank class
        Bank myAccount = new Bank();

        // Withdraw 7000 from the account
        myAccount.withdraw(7000);

        // Deposit 5000 into the account
        myAccount.deposit(5000);

        // Display the total balance
        myAccount.displayBalance();
    }
}
