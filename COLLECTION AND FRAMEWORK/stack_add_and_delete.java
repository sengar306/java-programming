import java.util.Stack;

public class stack_add_and_delete{
    public static void main(String[] args) {
        stackOperation st1= new stackOperation();
        st1.stackAdd("vivek");
        st1.stackAdd("Anjai");
        st1.stackAdd("jitesh");
        st1.stackAdd("kajal");
        st1.stackAdd("Riya");
        st1.stackAdd("Tanish");
        st1.stackAdd("Shami");
        st1.stackAdd("Roshan");
        st1.stackAdd("Nancy");
        st1.stackAdd("Shipra");
        System.out.println("Before deleting the element from the stack");
        st1.display();
        System.out.println("-------------------------------");
        st1.stackDelete();
        st1.stackDelete();
        st1.stackDelete();
        st1.stackDelete();
        System.out.println("After deleting the element from the stack");
        st1.display();
        



    }
}
class stackOperation{
    Stack<String> s1;
    stackOperation()
   {
   s1=new Stack<>();
   }
   void stackAdd(String val)
   {
    s1.push(val);
   }
   void stackDelete()
   {
    s1.pop();
   }
   void display()
   {
    System.out.println(s1);
   }



}