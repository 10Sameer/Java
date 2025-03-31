class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Animal myAnimal;  // Reference variable of parent class
        
        // At runtime, JVM decides which version of makeSound() to call
        myAnimal = new Animal();
        myAnimal.makeSound();  
        
        myAnimal = new Dog();
        myAnimal.makeSound();  
        
        myAnimal = new Cat();
        myAnimal.makeSound();  
    }
}

//overriding