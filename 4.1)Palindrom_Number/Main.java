import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(isPalindrom(number));

    }
    private static boolean isPalindrom(int number) {
        int temp = number;
        int lastNumber, reverseNumber = 0;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(reverseNumber == number){
            return true;
        }else {
            return false;
        }
    }
}