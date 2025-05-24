import java.util.Scanner;

public class ComplexDoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display menu
            System.out.println("====== Simple Calculator ======");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();
            double a, b, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;
             