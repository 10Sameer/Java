import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // The menu will keep repeating as long as choice is not 5 (Exit)
        while (choice != 5) {
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
                case 3:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1-5.");
            }

            System.out.println(); // Add a blank line for spacing
        }

        scanner.close();
    }
}
