import java.util.InputMismatchException;
import java.util.Scanner;
public class Taximeter_Program {
    private static final double START_FEE = 10;
    private static final double AMOUNT_PER_KM = 2.2;
    private static final double MIN_FEE = 20;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double perKm = 2.20, km;
        try {

            System.out.print("Enter the distance in km: ");
            km = scanner.nextDouble();
            if (km < 0) {
                throw new IllegalArgumentException("Distances can not be negative");
            }
            double totalFee = calculateFee(km);
            System.out.println("The total fee is: " + totalFee);

        }catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    private static double calculateFee(double km) {
        double totalFee = km * AMOUNT_PER_KM + START_FEE;
        return (!(totalFee <= MIN_FEE)) ? totalFee : MIN_FEE;
    }
}