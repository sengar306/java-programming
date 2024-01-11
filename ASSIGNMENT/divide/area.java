public class area{
    public static void main(String[] args) {
        
         try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be executed
        } 
       
        catch(ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Error: " + e.getMessage());
        } 
         finally {
            // Code that will be executed no matter what
            System.out.println("Finally block executed.");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
