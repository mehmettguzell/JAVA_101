import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int age, distance;
            System.out.print("DISTANCE (KM): ");
            distance = scanner.nextInt();
            System.out.println("---------------");
            System.out.print("AGE: ");
            age = scanner.nextInt();
            System.out.println("---------------");


            scanner.nextLine();

            System.out.println("Trip type: ");
            System.out.println("1)One Way");
            System.out.println("2)Round Trip");
            System.out.print("Choice: ");
            int tripType = Integer.parseInt(scanner.nextLine());
            if (tripType != 1 && tripType != 2) {
                throw new NumberFormatException("Invalid trip type! Please enter 1 or 2: ");
            }
            System.out.println("---------------");

            double price = calculatePrice(age, distance, tripType);
            System.out.println("Your price : " + price);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.nextLine();
        }
    }

    private static double calculatePrice(int age, int distance, int tripType) {
        final double pricePerKm = 0.10;
        double totalPrice = distance * pricePerKm;
        if (age < 12) {
            totalPrice *= 0.5;
        } else if (age >= 65) {
            totalPrice *= 0.7;
        } else if (age < 24) {
            totalPrice *= 0.9;
        }
        if (tripType == 2) {
            totalPrice *= 0.8;
            totalPrice += totalPrice;
        }
        return totalPrice;
    }
}