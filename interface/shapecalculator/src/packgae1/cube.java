package packgae1;
import java.util.*;
import packgae1.Threeinterface.Shape;

public class cube implements Shape {

    Scanner sc=new Scanner(System.in);
    float side;
    cube(float s)
    {   System.out.println("Enter the side of cube ");
          side=s;

    }
    
    public void csa() {
        float csa=4*side*side;
        System.out.println(csa);
    }

    public void tsa() {
       
    }

    @Override
    public void volume() {
        
    }
     
}
