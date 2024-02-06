package prjectshape;
import java.util.*;
//this class for only cube 
//implements interface and extend inheritance
public class cube extends predisplay  implements Shape {

    Scanner sc=new Scanner(System.in);
    float side;
    cube()//cube constructor
      
    {   
    	
    	System.out.println("-----------------CUBE-----------");
        System.out.println("ENTER THE SIDE OF CUBE (cm)  ");
        side= sc.nextFloat();
        proo();
            

    }
    //function csa
    public void csa() {
    	
        float csa=4*side*side;
        System.out.println("The curved surface area  of cube is :  "+csa+"sq.cm");
        
        
    }
    //function for tsa
    public void tsa() {
    	 float tsa=6*side*side;
         System.out.println("The Total surface area  of cube is :"+ tsa+ "sq.cm");

       
    }
//function for volume
    @Override
    public void volume() {
    	float volume=side*side*side;
        System.out.println("The Volume of cube is :"+ volume +"cu.cm"  );
        
        
    }
     
}
