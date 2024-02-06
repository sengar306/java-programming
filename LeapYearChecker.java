import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
         //Take the input 
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) //condition apply for leap year{
            System.out.println(year + " is a leap year.");//print the if leap year 

        } else {
            System.out.println(year + " is not a leap year.");//print the if  not leap year
        }
    }
}
