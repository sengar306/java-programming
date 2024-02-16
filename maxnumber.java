import java.util.Scanner;


class MaxFinder {
    // Method to find the maximum of two numbers
    public static double findMax(double num1, double num2) {
        return (num1 >= num2) ? num1 : num2;
    }
}


public class maxnumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Create an object of MaxFinder class
        MaxFinder maxFinder = new MaxFinder();

        // Use the object to find the maximum
        double maxNumber = maxFinder.findMax(num1, num2);

        // Display the result
        if (num1 == num2) {
            System.out.println("The numbers are equal: " + num1 + " and " + num2);
        } else {
            System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + maxNumber);
        }

    }
}
