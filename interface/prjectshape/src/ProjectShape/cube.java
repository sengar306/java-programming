package  ProjectShape;
import java.util.*;


public class cube extends calculation  implements Shape {

    Scanner sc=new Scanner(System.in);
    float side;
    cube()
      
    {   
    	
    	System.out.println("-----------------CUBE-----------");
        System.out.println("ENTER THE SIDE OF CUBE (cm)  ");
        side= sc.nextFloat();
        proo();
            

    }
    
    public void csa() {
    	
        float csa=4*side*side;
        System.out.println("The curved surface area  of cube is :  "+csa+"sq.cm");
        
        
    }
    
    public void tsa() {
    	 float tsa=6*side*side;
         System.out.println("The Total surface area  of cube is :"+ tsa+ "sq.cm");

       
    }

    @Override
    public void volume() {
    	float volume=side*side*side;
        System.out.println("The Volume of cube is :"+ volume +"cu.cm"  );
        
        
    }
     
}
