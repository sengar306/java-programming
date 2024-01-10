package prjectshape;
import java.util.*;


public class cone extends predisplay  implements Shape {

    Scanner sc=new Scanner(System.in);
    float length;
    float height;
    float radius;
    cone()
    {   System.out.println("-----------------CONE-----------");
        System.out.println("ENTER THE  RADIUS OF CONE");
        radius= sc.nextFloat();
        System.out.println("ENTER THE HEIGHT OF CONE ");
        height= sc.nextFloat();
        System.out.println("ENTER THE Slant Height OF CONE ");
        length= sc.nextFloat();
        proo();
            

    }
    
    public void csa() {
    	
        float csa=Shape.pi*radius*length;
        System.out.println("The curved surface area  of Cone is :" +csa+"sq.cm");
        
    }
    
    public void tsa() {
    	 float tsa=Shape.pi*radius*(radius+length);
         System.out.println("The Total surface area  of Cone is :"+tsa+"sq.cm");
        
       
    }

    @Override
    public void volume() {
    	float volume=(1/3)*Shape.pi*radius*radius*height;
        System.out.println("The Volume of cone is :"+volume+"cu.cm");
        
        
    }
     
}
