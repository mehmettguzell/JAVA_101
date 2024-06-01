import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("size of array: ");
        int n = scanner.nextInt();
        int []arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the value of the "  + (i+1) + "nd element: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }
        System.out.print("Sorted state: ");
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}