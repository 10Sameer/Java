// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test inheritance
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Calling inherited method
        myDog.bark(); // Calling method of Dog class
    }
}
