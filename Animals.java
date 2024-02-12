public class Animals {
    //create the class animals
 class Animals{
    public void makesound(){
        System.out.println("The animal makes a sound.");

    }
}
    //create the new class name Dog and inherit it to the derived class
    class Dog extends Animals{
        public void makesound(){
            System.out.println("The dog barks.");
        }
      


    }
     //create the new class name Cat and inherit it to the derived class
    class Cat extends Animals{
        public void makesound(){
            System.out.println("The cat meows.");
        }
        

    }

 
public class Animal{
    public static void main(String[] args) {
        
        Dog dg=new Dog();
        dg.makesound();

        Cat ct =new Cat();
        ct.makesound();

    }   
        
}
    
}
