import java.util.Scanner;


class StrongNumberChecker {
    // Method to calculate the factorial of a number
    private int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    // Method to check if a number is a Strong number
    public boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of factorial of digits
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}


public class StrongNumber{
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Create an object of StrongNumberChecker class
        StrongNumberChecker strongNumberChecker = new StrongNumberChecker();

        // Check if the number is a Strong number
        boolean isStrong = strongNumberChecker.isStrongNumber(inputNumber);
hi
        // Display the result
        if (isStrong) {
            System.out.println(inputNumber + " is a Strong number.");
        } else {
            System.out.println(inputNumber + " is not a Strong number.");
        }

       
}
}