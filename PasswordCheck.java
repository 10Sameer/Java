
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (!password.equals("java123"));

        System.out.println("Access granted!");
    }
}
