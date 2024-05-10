import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        if (limit <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
            return;
        }

        System.out.println("Multiples of four: ");
        for (int i = 1; i <= limit; i*=4){
            System.out.print(i + "\t");
        }

        System.out.println("\nMultiples of five: ");
        for (int i = 1; i <= limit; i*=5){
            System.out.print(i + "\t");
        }
    }
}