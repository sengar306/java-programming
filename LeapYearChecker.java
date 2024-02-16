import java.util.Scanner;


class LeapYearChecker {
    // Method to check if a year is a leap year
    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}


public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input a year
        System.out.print("Enter a year: ");
        int inputYear = scanner.nextInt();

        // Create an object of LeapYearChecker class
        LeapYearChecker leapYearChecker = new LeapYearChecker();

        // Check if the year is a leap year
        boolean isLeapYear = leapYearChecker.isLeapYear(inputYear);

        // Display the result
        if (isLeapYear) {
            System.out.println(inputYear + " is a leap year.");
        } else {
            System.out.println(inputYear + " is not a leap year.");
        }

        
    }
}
