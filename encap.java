public // Encapsulation Example
class Person {
    // Private variables to prevent direct access
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Ensuring valid age
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

// Main class

// Encapsulation Example
class Person {
    // Private variables to prevent direct access
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Ensuring valid age
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

// Main class
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating an object of Person
        Person person = new Person("John Doe", 25);

        // Accessing data using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying data using setters
        person.setName("Alice");
        person.setAge(30);

        // Displaying updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
