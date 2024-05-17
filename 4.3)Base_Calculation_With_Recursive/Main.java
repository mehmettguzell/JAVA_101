import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base value: ");
        int base = scanner.nextInt();
        System.out.print("exponent value: ");
        int exponent = scanner.nextInt();
        int result = power(base, exponent);
        System.out.println("The result = " + result);
    }

    private static int power(int base, int exponent) {
        if (exponent == 0)
             return  1;
        else {
            return base * power(base, exponent - 1);
        }
    }
}