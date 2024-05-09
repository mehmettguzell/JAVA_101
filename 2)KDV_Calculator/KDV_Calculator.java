import java.util.InputMismatchException;
import java.util.Scanner;

public class KDV_Calculator {
    private static final double KDV_HIGH = 0.18;
    private static final double KDV_LOW = 0.08;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount without KDV: ");
        double initAmount = 0;
        try {
            initAmount = scanner.nextDouble();
            if (initAmount < 0) {
                throw new IllegalArgumentException("Negative amount is not allowed");
            }
            double totalAmount = Calculate(initAmount);
            System.out.println("TOTAL AMOUNT(With KDV): " + totalAmount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number. ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double Calculate(double initAmount) {
        double kdv, kdvAmount;

        if (initAmount >= 1000) {
            kdv = KDV_LOW;
        } else {
            kdv = KDV_HIGH;
        }

        return initAmount + (initAmount * kdv);
    }
}
