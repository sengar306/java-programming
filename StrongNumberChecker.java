import java.util.Scanner;
public class StrongNumberChecker {
    // Function for  factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    // Function to check if a number is a Strong number
    static boolean isStrongNumber(int num) {
        int originalNum = num;
        int digitSum = 0;
        while (num > 0) {
            int digit = num % 10;
            digitSum += factorial(digit);
            num /= 10;
        }
        return digitSum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // Checking if the number is a Strong number
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }
    }
}
