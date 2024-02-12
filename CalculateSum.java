import java.util.*;// util package

public class CalculateSum {
    public static void main(String args[]) {
        EvenSum e1 = new EvenSum(); //Create a object for Evensum 
       int sum= e1.sum();// 
        e1.display(sum);//display the output
    }
}
//to create the class for task
class EvenSum {
    List<Integer> l1;
// constructor
    EvenSum() {
        //create object for arraylist
        l1 = new ArrayList<>();
       //add element into arraylist
        l1.add(45);
        l1.add(56);
        l1.add(23);
        l1.add(34);
    }
 //create sum for all even number 
    public int sum() {
        int add = 0;
        Iterator<Integer> iterator = l1.iterator();//create  iterator object
        while (iterator.hasNext()) {
            int num = iterator.next();
           // condition for even number 
            if (num % 2 == 0) {
                add += num;
            }
        }
        return add;
    }
   //display method
    public void display(int sum) {
        System.out.println(l1);
        System.out.println("The sum of even numbers present in ArrayList: " + sum);
    }
}
