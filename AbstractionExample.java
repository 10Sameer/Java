public class AbstractionExample {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Can't instantiate abstract class
        
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound(); // Output: Bark bark!
        myDog.sleep();     // Output: Zzz
        
        myCat.makeSound(); // Output: Meow!
        myCat.sleep();     // Output: Zzz
    }
}


abstract class Animal {
    public abstract void makeSound();
    
    // Regular method with implementation
    public void sleep() {
        System.out.println("Zzz");
    }
}

