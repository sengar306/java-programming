import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the maximum using the ternary operator
        int maxNumber = (num1 > num2) ? num1 : num2;

        // Display the result
        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + maxNumber);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
