import java.util.*;// import util package

public class ReverseString {
    public static void main(String args[]) {// main method
        Reverse r1 = new Reverse();// create object 
        r1.reverseList();
        r1.display();
    }
}

class Reverse {
    List<String> li;

    Reverse() {
        li = new ArrayList<>();//create array list 
        //add element in the arraylist
        li.add("vivek");
        li.add("shami");
        li.add("Shrestha");
    }

    public void reverseList() {
        //reverse the arrayList using reverse method
        Collections.reverse(li);

       
    }
    public void display()//display method
        {
            System.out.println(li);
        }
}
