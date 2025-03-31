// Parent class (Superclass)
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class (Subclass) - inherits from only ONE parent class
class Car extends Vehicle {  
    void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();       
        myCar.accelerate();  
    }
}