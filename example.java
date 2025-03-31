interface Walkable {
    default void walk() {  // Default method (Java 8+)
        System.out.println("Walking...");
    }
}

interface Swimmable {
    default void swim() {
        System.out.println("Swimming...");
    }
}

// Class implements multiple interfaces
class Amphibian implements Walkable, Swimmable {
    void action() {
        walk();  // Calls Walkable's default method
        swim();  // Calls Swimmable's default method
    }
}

public class Example {
    public static void main(String[] args) {
        Amphibian frog = new Amphibian();
        frog.action();
    }
}