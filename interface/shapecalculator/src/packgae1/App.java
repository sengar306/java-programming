package packgae1;

import java.util.*;

import javafx.scene.shape.Shape;


public class App{
    public static void main(String[] args) throws Exception {
      System.out.println("SELET ANY ONE FROM these shape");
      System .out.println("PRESS 1 FOR THE CUBE");
      System .out.println("PRESS 2 FOR THE CUBIOD");
      System .out.println("PRESS 3 FOR THE CONE");
      System .out.println("PRESS 4 FOR THE CYLINDER");
      System .out.println("PRESS 5 FOR THE SPHERE");
      Scanner sc=new Scanner(System.in);
      int select=sc.nextInt();
      switch(select)
      {
         case 1:
         {
               System.out.println("-----------------CUBE-----------");
                Shape c1=new cube(5.0f);
                c1.csa();
                
         }
         default:{
          System.out.println("back");
         }
      }
    }
}
 
 


  




     

    
