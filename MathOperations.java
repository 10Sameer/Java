public class MathOperations {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Overloaded method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        // Calling different versions of add() method
        System.out.println("Sum of two integers: " + math.add(5, 7));
        System.out.println("Sum of three integers: " + math.add(5, 7, 3));
        System.out.println("Sum of two doubles: " + math.add(5.5, 7.3));
        System.out.println("Concatenated strings: " + math.add("Hello", " World"));
    }
}
//method overloading