//creating the class hillstaton



class HillStation{
    //declaration of function
    public void location(){
        System.out.println("This place is situated in : ");

    }
    public void Famousfor(){
        System.out.println("This place is famous for : ");

    }
    //Inheriting the new derived class with the base class(hillStation)
    class Manali extends HillStation{
        public void location(){
            System.out.println(" It is is uttarakhand");
        }
        public void Famousfor(){
            System.out.println("This is famous for snowfall");
        }


    }
     //Inheriting the new derived class with the base class(hillStation)
    class Mussoorie extends HillStation{
        public void location(){
            System.out.println(" It is is Himanchal Pradesh");
        }
        public void Famousfor(){
            System.out.println("This is famous for mountains");
        } 

    }
    //Inheriting the new derived class with the base class(hillStation)

    class Gulmarg extends HillStation{
        public void location(){
            System.out.println(" It is in Jammu and Kashmir");
        }
        public void Famousfor(){
            System.out.println("This is famous for Himalayan mountains ");
        }

    }
} 
public class HillStations {
    public static void main(String[] args) {
        Manali ma=new Manali();
        ma.location();
        ma.Famousfor();

        Mussoorie mu =new Mussoorie();
        mu.location();
        mu.Famousfor();

        Gulmarg gl = new Gulmarg();
        gl.location();
        gl.Famousfor();
        
    }
}