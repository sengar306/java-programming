import java.util.*;
public class inheritance{
 public static void main(String[] args) {
      Numericalcalculation s=new  Numericalcalculation();    
      s.addition();   
 }
}
class Number{
    protected int num1,num2;
    //constructor to intialize data through input
    public Number(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any two number");
         num1=sc.nextInt();
         num2=sc.nextInt();

    }

    public void display()
    {
        System.out.println("__---------------------------------------------");
        System.out.println("firstno" + num1);
         System.out.println("secondno" + num2);
    }
}
class Numericalcalculation extends Number{
//method for addition of number
public void addition()
{
    int sum;
    sum=super.num1+super.num2;
    //display numbers
    super.display();
    System.out.println("sum = "+ sum);
}
public void difference()
    {
        int sub=super.num1-super.num2;
        System.out.println("difference between " +super.num1 +"and" +super.num2 );

    }
}