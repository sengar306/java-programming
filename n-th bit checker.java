import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Input the bit position to check
        System.out.print("Enter the bit position (starting from 0): ");
        int n = scanner.nextInt();

        // Check if the nth bit is set or not
        int result = (num & (1 << n)) >> n;

        // Display the result
        System.out.println("The " + n + "th bit is " + result);
        
        scanner.close();
    }
}
