import java.util.Scanner;
public class calculator {
   public static void main(String args[])
   {  Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1=sc.nextInt();
        System.out.println("Enter the Second number");
        int number2=sc.nextInt();
        Numerical n1=new Numerical();
        n1.add(number1,number2);
        n1.mul(number1,number2);
        n1.sub(number1,number2);
        n1.div(number1,number2);
        

   } 
}
  class Numerical{
    public void add(int num1,int num2)
    {
        System.out.println("the addition  of " + num1 + " and " + num2 );
        System.out.println(num1+num2);
    }
     public void mul(int num1,int num2)
     {  System.out.println("the multiply  of " + num1 + " and " + num2 );
        System.out.println(num1*num2);
     }
      public void sub(int num1,int num2)
      { 5
      if(num1>num2)
        {System.out.println(num1-num2);}
        else{
            System.out.println(num2-num1);
        }
      }
      public void div(int num1,int num2){
           
            if(num1==1 && num2==0)
            {
                 System.out.println("the num1 and num2 division is not possible ");
            }
            else{
                 System.out.println("the division of num1 and num2 ");
                  System.out.println(num1/num2);
            }
      }
   }


