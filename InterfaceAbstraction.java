interface Shape {
    double calculateArea(); // abstract method
    void display();        // abstract method
}

class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void display() {
        System.out.println("This is a circle with radius " + radius);
    }
}

public class InterfaceAbstraction {
    public static void main(String[] args) {
        Shape myShape = new Circle(5.0);
        myShape.display();
        System.out.println("Area: " + myShape.calculateArea());
    }
}