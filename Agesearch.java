import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;
//exception class
class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String message) {
        super(message);
    }
}

class AgeDirectory {
    private TreeMap<String, Integer> ageMap;
//constructor
    public AgeDirectory() {
        this.ageMap = new TreeMap<>();
    }
// add person method
    public void addPerson(String name, int age) {
        ageMap.put(name, age);
        System.out.println("Person added successfully.");
    }
//find age 
    public String findAge(String name) throws PersonNotFoundException {
        Integer age = ageMap.get(name);
        if (age != null) {
            return age.toString();
        } else {
            throw new PersonNotFoundException("Name not found in the directory.");
        }
    }
// check map is empty oro not
    public boolean isMapEmpty() {
        return ageMap.isEmpty();
    }
}
//mainclass
public class Agesearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgeDirectory ageDirectory = new AgeDirectory();//object creationof agedirectoryclass

        while (true) {
            try {
                System.out.println("1. Find age by name");
                System.out.println("2. Add new name and age");
                System.out.println("3. Exit");
                System.out.print("Choose an option (1/2/3): ");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter name to find age: ");
                        String nameToFind = scanner.nextLine();
                        try {
                            String age = ageDirectory.findAge(nameToFind);
                            System.out.println("-------------------------------------------");
                            System.out.println("Age: " + age);
                            System.out.println("-------------------------------------------");
                        } catch (PersonNotFoundException e) {
                            System.out.println("Person Not Found: " + e.getMessage());
                        }
                        break;

                    case 2:
                        if (ageDirectory.isMapEmpty()) {
                            System.out.println("Your Database is blank. Please add the entry first.");
                        } else {
                            System.out.print("Enter name: ");
                            String newName = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int newAge = scanner.nextInt();
                            ageDirectory.addPerson(newName, newAge);
                        }
                        break;

                    case 3:
                        System.out.println("Exiting age directory program. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();  
            }
        }
    }
}
