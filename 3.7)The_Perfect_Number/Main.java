import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != -1) {
            System.out.print("Please enter a number(-1 for exit): ");
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            int sumDivisors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumDivisors += i;
                }
            }
            if (sumDivisors == number) {
                System.out.println("...Your Number Is A Perfect Number...");
            } else {
                System.out.println("...Your Number Is NOT A Perfect Number...");
            }
        }
    }
}