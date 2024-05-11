import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        int n = scanner.nextInt();
        System.out.print("Üs olacak sayı: ");
        int k = scanner.nextInt();
        int total = 1;

        int i = 1;
        while(i <= k){
            total *= n;
            i++;
        }

        System.out.println("Cevap: " + total);

    }
}