import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// exception class
class PhoneDirectoryException extends Exception {
    public PhoneDirectoryException(String message) {
        super(message);
    }
}
//mainclass
public class phonebook{

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phone Directory");

        while (true) {
            try {
                System.out.println("\nChoose an option:");
                System.out.println("1. Find a phone number");
                System.out.println("2. Add a new entry");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();// input ofr choice
                scanner.nextLine();  

                switch (choice) {
                    case 1:  // to find a phone number
                        System.out.print("Enter name to find phone number: ");
                        String nameToFind = scanner.nextLine();
                        findPhoneNumber(nameToFind, phoneBook);
                        break;

                    case 2:// to add number in phone book
                        System.out.print("Enter name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String newNumber = scanner.nextLine();
                        addPhoneNumber(newName, newNumber, phoneBook);
                        break;

                    case 3:// exit
                        System.out.println("Exiting the program. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (PhoneDirectoryException e) {
                System.out.println("Phone Directory Exception: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
                scanner.nextLine();  // Consume the newline character
            }
        }
    }
//method for find phone number
    private static void findPhoneNumber(String name, Map<String, String> phoneBook) throws PhoneDirectoryException {
        if (!phoneBook.containsKey(name)) {
            throw new PhoneDirectoryException("Name not found in the phone directory.");
        }
        String phoneNumber = phoneBook.get(name);
        System.out.println("Phone number for " + name + ": " + phoneNumber);
    }
// method for addnumber in directory
    private static void addPhoneNumber(String name, String phoneNumber, Map<String, String> phoneBook) throws PhoneDirectoryException {
        if (phoneBook.containsKey(name)) {
            throw new PhoneDirectoryException("Name already exists in the phone directory. Use a different name.");
        }
        phoneBook.put(name, phoneNumber);
        System.out.println("Entry added: " + name + " - " + phoneNumber);
    }
}
