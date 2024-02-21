
public class Student_ implements Comparable<Student_> {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student1 = new Student("John Doe", 20);

        // Using the getter methods
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());

        // Using the setter methods
        student1.setName("Jane Doe");
        student1.setAge(22);

        // Displaying updated information
        System.out.println("Updated Name: " + student1.getName());
        System.out.println("Updated Age: " + student1.getAge());
    }
    private String name;
    private int age;

    private String id;

    // Constructor
    public Student_(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    

    // Getter for age
    public int getAge() {
        return age;
    }
    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
    // Setter for id 
    public void  setId(String id )
    {
        this.id=id;
    }

    // getter for id 
    public String  getId()
    {
        return id;
    }

    @Override
    public int compareTo(Student_ o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
