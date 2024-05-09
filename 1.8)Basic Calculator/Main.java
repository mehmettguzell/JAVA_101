import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPlayAgain = true;

        while(isPlayAgain)
        {
            int n1, n2, select;
            System.out.print("Input the first value: "); n1 = scanner.nextInt();
            System.out.print("Input the second value: "); n2 = scanner.nextInt();
            System.out.println("-------------------------");
            System.out.print("1)Addition\n2)subtraction\n3)multiplication\n4)division\nYour choice:");
            select = scanner.nextInt();

            switch(select) {
                case 1:
                    System.out.println("Sonuç: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Sonuç: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Sonuç: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("Sonuç: " + ((double) n1 / n2));
                    } else {
                        System.out.println("Bir sayı sıfıra bölünemez!");
                    }
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }
            System.out.println("Would you like to play again (y/n) ?");
            char playAgainChoice = scanner.next().charAt(0);
            isPlayAgain = (playAgainChoice == 'y' || playAgainChoice == 'Y');
        }
        System.out.println("GOODBYE!");
    }
}