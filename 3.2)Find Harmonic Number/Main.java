import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        double harmonic = 0.0;

        for (double i = 1; i <= number; i++){
            harmonic += (1/i);
        }
        System.out.println(harmonic);
    }
}