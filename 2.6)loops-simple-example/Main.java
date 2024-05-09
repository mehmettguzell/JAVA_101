import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i = 0 ; i <= number; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println("Num: "+ i);
                sum += i;
            }
        }
        System.out.println("The sum of the numbers up to the number you entered and divisible by both 3 and 4: " + sum);
    }
}