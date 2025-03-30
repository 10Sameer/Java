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


