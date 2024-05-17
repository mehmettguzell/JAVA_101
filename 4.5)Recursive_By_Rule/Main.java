import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number N: ");
        int N = scanner.nextInt();
        System.out.print("Output: ");
        RecursiveFunction(N, N);
    }

    private static void RecursiveFunction(int original, int current) {
        if (current <= 0) {
            System.out.print(current + " ");
            return;
        }
        System.out.print(current + " ");
        RecursiveFunction(original, current - 5);
        System.out.print(current + " ");
    }
}