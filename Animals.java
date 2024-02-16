import java.util.Scanner;


class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Animal class
        Animal a1= new Animal();

        // Display the sound of the generic animal
        System.out.println("Sound of the generic animal:");
        a1.makeSound();
        System.out.println();

        // Create an object of the Dog class
        Dog myDog = new Dog();

        // Display the sound of the dog
        System.out.println("Sound of the dog:");
        myDog.makeSound();
        System.out.println();

        // Create an object of the Cat class
        Cat myCat = new Cat();

        System.out.println("Sound of the cat:");
        myCat.makeSound();

        
    }
}
