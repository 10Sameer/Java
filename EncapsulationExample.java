public class EncapsulationExample {
    
}
// Encapsulated class
class Student {
    // Private fields (data hiding)
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    // Setter method for age (validating age)
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter method for grade
    public String getGrade() {
        return grade;
    }

    // Setter method for grade
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student("Sameer", 21, "A");

        // Accessing data through getter methods
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());

        // Modifying data using setter methods
        student1.setAge(21);
        student1.setGrade("A+");

        // Display updated information
        student1.displayInfo();
    }
}
