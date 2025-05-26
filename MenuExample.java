import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("Bye!");
            } else if (choice != 3) {
                System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        System.out.println("Program ended.");
    }
}
