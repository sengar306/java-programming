import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of student grades:");

        int numGrades = 0;
        boolean validInput = false;

        // Handling invalid input for the number of grades
        while (!validInput) {
            try {
                numGrades = scanner.nextInt();
                if (numGrades <= 0) {
                    System.out.println("Please enter a valid number of grades greater than 0.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        }

        int[] grades = new int[numGrades];

        // Handling invalid input for each grade
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            while (true) {
                try {
                    grades[i] = scanner.nextInt();
                    break; // Exit the loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Consume the invalid input
                }
            }
        }

        // Calculate average
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / numGrades;

        System.out.println("Grades entered: " + java.util.Arrays.toString(grades));
        System.out.println("Average grade: " + average);

        
    }
}
