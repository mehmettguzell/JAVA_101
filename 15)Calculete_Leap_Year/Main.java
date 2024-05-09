import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a year to calculate (-1 to exit): ");
                int yearInput = scanner.nextInt();
                if (yearInput == -1) {
                    System.out.println("Exiting the program");
                    break;
                }
                if (isValidYear(yearInput)) {
                    if (isLeakYear(yearInput)) {
                        System.out.println(yearInput + " is leap year.");
                    } else {
                        System.out.println(yearInput + " is not leap year.");
                    }
                } else {
                    System.out.println("You entered an invalid year. TRY AGAIN");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                scanner.next();
            }
        }
        scanner.close();
    }

    private static boolean isLeakYear(int yearInput) {
        return (yearInput % 4 == 0) && ((yearInput % 100 != 0) || (yearInput % 400 == 0));
    }

    public static boolean isValidYear(int year) {
        return year > 0;
    }
}
