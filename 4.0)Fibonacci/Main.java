import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            long[] fibonacciSeries = new long[num + 1];
            fibonacciSeries[0] = 0;
            if (num > 1) {
                fibonacciSeries[1] = 1;

                for (int i = 2; i <= num; i++) {
                    fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
                }
            }
            System.out.println("Fibonacci Series: ");
            for (int i = 0; i <= num; i++) {
                System.out.print(fibonacciSeries[i] + " ");
            }
        } else {
            System.out.println("The number must be positive");
        }
        scanner.close();
    }
}
