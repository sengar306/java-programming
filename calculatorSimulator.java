import java.util.*;

public class calculatorSimulator {
    public static void main(String args[]) {
        try {
            TaxCalculator t1 = new TaxCalculator();// object of tax calculator
            t1.input();// input method called
            t1.calculateTax();//calculateTax mehod called
            t1.display();//to display the taxamount 
        } catch (Exception e) {                       //catch block
            System.out.println(e.getMessage());
            e.printStackTrace(); 
        }
    }

    static class TaxCalculator {// tax calculator
        String empName;//declare all parameter
        boolean isIndian;
        double empSalary;
        double taxamount;
        //this method for input and declare all exception
        public void input() throws CountryNotValidException, EmployeeNameInvalidException,TaxNotEligibleException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the employee name");
            empName = sc.next();
             if (empName == null || empName.trim().isEmpty()) {
                throw new EmployeeNameInvalidException("The employee name cannot be empty");//exception throw when employee null
            }
            System.out.println("Enter the employee salary");
            empSalary = sc.nextDouble();
            if(empSalary<10000)
            {
                
                    throw new TaxNotEligibleException("The employee does not need to pay tax");//exception throw when salary <10000
            }
            System.out.println("Is the employee Indian (true/false)?");
            isIndian = sc.nextBoolean();
            if (!isIndian) {
                throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");//exception thow when  you are not indian
            }
        }
         //this method for display the amout
        public void display() {
            System.out.println("Tax amount: " + taxamount);
        }
      // calculate all tax on the given condition
        public void calculateTax()  {
            if (empSalary >= 100000) {
                taxamount = empSalary * 8 / 100;
            } else if (empSalary >= 50000) {
                taxamount = empSalary * 6 / 100;
            } else if (empSalary >= 30000) {
                taxamount = empSalary * 5 / 100;
            } else  {
                taxamount = empSalary * 4 / 100;
            } 
        }
    }
//custom excetion classes
    static class CountryNotValidException extends Exception {
        public CountryNotValidException(String message) {
            super(message);
        }
    }

    static class EmployeeNameInvalidException extends Exception {
        public EmployeeNameInvalidException(String message) {
            super(message);
        }
    }

    static class TaxNotEligibleException extends Exception {
        public TaxNotEligibleException(String message) {
            super(message);
        }
    }
}
