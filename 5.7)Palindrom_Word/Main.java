import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String curr = scanner.nextLine();

        System.out.println(isPalindrom(curr));
        System.out.println(isPalindrom2(curr));

    }

    private static boolean isPalindrom2(String curr) {
        int i = 0, j = curr.length() - 1;
        while (i < j){
            if(curr.charAt(i) != curr.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    private static boolean isPalindrom(String curr) {
        String reverse = "";
        for(int i  = curr.length() - 1; i >= 0; i--){
            reverse += curr.charAt(i);
            if (reverse.equals(curr))
                return true;
        }
        return false;
    }
}