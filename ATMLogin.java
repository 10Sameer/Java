import java.util.Scanner;

public class ATMLogin {
    public static void main(String[] args) {
        final String correctPin = "1234";
        int attempts = 0;
        final int maxAttempts = 3;
        String userInput;
        Scanner scanner = new Scanner(System.in);

        
