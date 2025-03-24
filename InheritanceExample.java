// Parent class (Superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
    
    void sleep() {
        System.out.println("This animal sleeps");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Methods inherited from Animal
        myDog.eat();    // Output: This animal eats food
        myDog.sleep();   // Output: This animal sleeps
        
        // Method from Dog class
        myDog.bark();    // Output: The dog barks
    }
}