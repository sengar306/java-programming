package prjectshape;
import java.util.*;

//this class for cube 
public class cubiod extends predisplay  implements Shape {

    Scanner sc=new Scanner(System.in);
    float length;
    float height;
    float width;
    cubiod()
    {   System.out.println("-----------------CUBIOD-----------");
        System.out.println("ENTER THE LENGTH OF CUBIOD(cm) ");
        length= sc.nextFloat();
        System.out.println("ENTER THE height OF CUBIOD(cm) ");
        height= sc.nextFloat();
        System.out.println("ENTER THE width OF CUBIOD(cm) ");
        width= sc.nextFloat();
        proo();
           
    }
    
    public void csa() {
    	
        float csa=2*((length*height)+(width*height));
        System.out.println("The curved surface area  of cubiod is :" + csa+ "sq.cm" );
        System.out.println(csa);
    }
    
    public void tsa() {
    	 float tsa=2*((length*width)+(width*height)+(height*length));
         System.out.println("The Total surface area  of cubiod is :"+tsa+"sq.cm");
       
       
    }

    @Override
    public void volume() {
    	float volume=length*width*height;
        System.out.println("The Volume of cubiod is :"+volume+"sq.cm");
       
        
    }
     
}
