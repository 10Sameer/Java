import java.util.Scanner;

public class ATMLogin {
    public static void main(String[] args) {
        final String correctPin = "1234";
        int attempts = 0;
        final int maxAttempts = 3;
        String userInput;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your 4-digit PIN: ");
            userInput = scanner.nextLine();
            attempts++;

            if (userInput.equals(correctPin)) {
                System.out.println("Access granted!");
                break;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }

        } while (attempts < maxAttempts);

        if (!userInput.equals(correctPin)) {
            System.out.println("Account locked due to too many failed attempts.");
        }

        scanner.close();
    }
}
