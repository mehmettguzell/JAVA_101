import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        try {
            do {
                System.out.print("Enter a value: ");
                input = scanner.nextInt();
                System.out.println("Your input: " + input);
            }
            while (input >= 0);
        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers only. ");
        }
    }
}