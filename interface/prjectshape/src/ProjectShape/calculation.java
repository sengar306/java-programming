package ProjectShape;

import java.util.Scanner;

public class calculation {
	boolean con;
	 Scanner sc=new Scanner(System.in);
	
	void proo() {
   	 System.out.println("PRESS 1 for the Curved surface area");
        System.out.println("PRESS 2 for the Total surface area");
        System.out.println("PRESS 3 for the Volume");
        System.out.println("press 4 for  back");
        System.out.println("Enter the Choice");
    }
	 void csa_tsa(Shape c1){
		boolean con=false;
		do{char choice = sc.next().charAt(0);
        switch(choice)
        {
        case '1':
        {
      	 c1.csa(); 
      	 break;
      	 
      	
        }
        case '2':
        {
      	  c1.tsa();
      	  break;
      	
        }
        case '3':
        { 
      	  c1.volume();
      	  break;
        }
      	  case '4':
      	  {
      		  pre();
      	  }
      	  
        
       
        
        default:
        {	
      	  System.out.println("you can use incorrect option Please try agian");
      	  System.out.println("-------------------------------------------------------------");
      	  con =true;
      	  proo();
        }
        
        }
		}while (con);
     
     }
	
    void pre() {
   
	 
     System .out.println("PRESS 1 FOR THE CUBE");
     System .out.println("PRESS 2 FOR THE CUBIOD");
     System .out.println("PRESS 3 FOR THE CONE");
     System .out.println("PRESS 4 FOR THE CYLINDER");
     System .out.println("PRESS 5 FOR THE SPHERE");
     System .out.println("PRESS 6 FOR THE RESTART");
     System.out.println("Select from above options");
    
    
     
  do  {
    	 char select=sc.next().charAt(0);
    	 switch(select)
      {
      
        case '1':
        {     
              do {
              Shape c1=new cube();
              csa_tsa(c1);             
              }while (con);
              break;
          }  
        case '2':
        {
        	Shape c1=new cubiod();
        	csa_tsa(c1);
        	break;
        	 
          } 
        case '3':
        {
        	Shape c1=new cone();
        	csa_tsa(c1);
             break;
          }
        case '4':
        {
        	Shape c1=new Cylinder();
        	csa_tsa(c1);
             break;
          }
        case '5':
        {    
             
             
              Shape c1=new sphere();
              csa_tsa(c1);
              break;
        }
        case '6':{
        	pre();
        }
        
        default:{
        	System.out.println("you can use incorrect option Please try agian");
        	con=true;
        	
        	
        	
            
        }
     }
    }while(con);
  
    
        System.out.println("press 9 to restart");
        System .out.println("press any key for exit");
        char replay=sc.next().charAt(0);
        switch(replay){
        case '9':
        {
         pre(); 
        }
       
        default :
        	System.out.println("Thank u");
        
        
        }
        
        
        
        
        
     }
    
     
    
    }
   
   

	


