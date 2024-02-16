import java.util.HashSet;
import java.util.*;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashset_add_method{
    public static void main(String[] args) {
          Hashset_Operation h_p1 = new Hashset_Operation();
          h_p1.Hashset_add(0);
          h_p1.Hashset_add(1);
          h_p1.Hashset_add(2);
          h_p1.Hashset_add(3);
          h_p1.Hashset_add(4);
          h_p1.display();


    }
}
class Hashset_Operation
{   HashSet<Integer> h1;
    Hashset_Operation()
    {
          h1=new HashSet<>();
    }
    void Hashset_add(int num)
    {
        h1.add(num);
    }
    /**
     * 
     */
    void display()
    {
       System.out.println(h1);
    }
    }
