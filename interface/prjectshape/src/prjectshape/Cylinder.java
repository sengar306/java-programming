package prjectshape;
import java.util.*;


public class Cylinder extends predisplay  implements Shape {

    Scanner sc=new Scanner(System.in);
    float length;
    float height;
    float radius;
    Cylinder()
    {   System.out.println("-----------------Cylinder-----------");
        System.out.println("ENTER THE LENGTH OF Cylinder  ");
        length= sc.nextFloat();
        System.out.println("ENTER THE Radius OF Cylinder ");
        radius= sc.nextFloat();
        System.out.println("ENTER THE Height OF Cylinder ");
        height= sc.nextFloat();
        proo();
            

    }
    
    public void csa() {
    	
        float csa=2*Shape.pi*radius*radius*height;
        System.out.println("The curved surface area  of Cylinder is :"+csa+"sq.cm");
        
    }
    
    public void tsa() {
    	 float tsa=2*Shape.pi*radius*(radius+height);
         System.out.println("The Total surface area  of Cylinder is :"+tsa+"sq.cm");
       
       
    }

    @Override
    public void volume() {
    	float volume=Shape.pi*radius*radius*height;
        System.out.println("The Volume of Cylinder is :"+volume+"cu.cm");
       
        
    }
     
}
