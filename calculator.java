import java.util.Scanner;
public class calculator {
   public static void main(String args[])
  {
       
        Numerical n1=new Numerical();
        // call the all method of numerical class
        n1.add();
        n1.mul();
        n1.sub();
        n1.div();
        

   } 
}

  class Numerical{  
    //create the numerical class
    Scanner sc = new Scanner(System.in);
    public void add()// ADD METHOD
    {  System.out.println("Enter the number for addition");    
      System.out.println("Enter the first number");
        // take first  number from use
        int num1=sc.nextInt();
        System.out.println("Enter the Second number");
        // take first  number from use
        int num2=sc.nextInt();
        // create the numerical object
        System.out.println("the addition  of " + num1 + " and " + num2 );
        System.out.println(num1+num2);
    }
     public void mul()//MULTIPLY METHOD

     {  System.out.println("Enter the number for MULTIPLY");      
      System.out.println("Enter the first number");
        // take first  number from use
        int num1=sc.nextInt();
        System.out.println("Enter the Second number");
        // take first  number from use
        int num2=sc.nextInt();
        // create the numerical object 
       System.out.println("the multiply  of " + num1 + " and " + num2 );
        System.out.println(num1*num2);
     }
      public void sub()// SUBTRACT METHOD

      { System.out.println("Enter the number for subtarction");   
        System.out.println("Enter the first number");
        // take first  number from use
        int num1=sc.nextInt();
        System.out.println("Enter the Second number");
        // take first  number from use
        int num2=sc.nextInt();
        // create the numerical object
      if(num1>num2)
        { System.out.println("the SUBTRACTION  of " + num1 + " and " + num2 );
          System.out.println(num1-num2);}
        else{
               System.out.println("the SUBTRACTION  of " + num1 + " and " + num2 );
             System.out.println(num2-num1);
        }
      }
      public void div(){

        // DIVIDION METHOD 
        System.out.println("Enter the number for DIVISION"); 
          System.out.println("Enter the first number");
        // take first  number from use
        int num1=sc.nextInt();
        System.out.println("Enter the Second number");
        // take first  number from use
        int num2=sc.nextInt();
        // create the numerical object
           
            if(num1==1 || num2==0)
            {
                 System.out.println("the num1 and num2 division is not possible ");
            }
            else{
                 System.out.println("the division of num1 and num2 ");
                  System.out.println(num1/num2);
            }
      }
   }


