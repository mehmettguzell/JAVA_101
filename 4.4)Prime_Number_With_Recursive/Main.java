import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrime(number, 2);
        if(isPrime){
            System.out.println(number + " is a prime number.");
        }else System.out.println(number + " is not a prime number.");
    }

    private static boolean isPrime(int number, int divisor) {
       if(number < 2)
            return false;
        if (number == 2){
            return true;
        }
        if(number % divisor == 0){
            return false;
        }
        if(divisor * divisor > number){
            return true;
        }
        return isPrime(number, divisor + 1 );
    }
}