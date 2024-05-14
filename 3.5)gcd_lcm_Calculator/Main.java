import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers spo you want to enter: ");
        int numberCount = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i<numberCount; i++){
            System.out.print("enter a number " + (i+1) + ": " );
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int gcdResult = numbers.get(0);
        int lcmResult = numbers.get(0);

        for(int i = 1; i < numbers.size(); i++){
            gcdResult = gcd(gcdResult, numbers.get(i));
            lcmResult = lcm(lcmResult, numbers.get(i));
        }
        System.out.println("gcd: " + gcdResult);
        System.out.println("lcm: " + lcmResult);

    }
    private static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return (a * b)/(gcd(a,b));
    }
}
