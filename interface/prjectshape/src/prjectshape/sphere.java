package prjectshape;
import java.util.*;


public class sphere extends predisplay  implements Shape {

    Scanner sc=new Scanner(System.in);
    float radius;
    sphere()
    {   System.out.println("-----------------SPHERE-----------");
        System.out.println("ENTER THE RADIUS OF SPHERE ");
        radius= sc.nextFloat();
        proo();
            

    }
    
    public void csa() {
    	
        float csa=4*Shape.pi*radius*radius;
        System.out.println("The curved surface area  of Sphere is :"+csa+"sq.cm");
        
    }
    
    public void tsa() {
    	 float tsa=4*Shape.pi*radius*radius;
         System.out.println("The Total surface area  of sphere is :"+tsa+"sq.cm");
       
       
    }

    @Override
    public void volume() {
    	float volume=(4/3)*Shape.pi*radius*radius*radius;
        System.out.println("The Volume of sphere is :"+volume+"cu.cm");
        
    }
     
}
