import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int attemps = 0;
        final int maxAttemps = 3;

        while (attemps < maxAttemps) {
            Console console = System.console();
            if (console == null) {
                System.out.println("No console found.");
                System.exit(1);
            }

            String username = console.readLine("Please enter your username: ");
            char[] passwordArray = console.readPassword("Please enter your password: ");
            String password = new String(passwordArray);

            if (checkCredential(username, password)) {
                System.out.println("Welcome");
                break;
            } else {
                attemps++;
                int remainingAttemps = maxAttemps - attemps;
                if (remainingAttemps > 0) {
                    System.out.println("Invalid username or password. Please try again.");
                } else System.out.println("You reached max login attemps. Exiting program");
            }
        }
    }

    private static boolean checkCredential(String username, String password) {
        return username.equals("mehmet") && password.equals("12345");
    }
}