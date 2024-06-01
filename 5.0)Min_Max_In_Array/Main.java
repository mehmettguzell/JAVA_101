import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of row: ");
        int row  = scanner.nextInt();
        System.out.print("number of col: ");
        int col  = scanner.nextInt();

        int [][] arr = new int[row][col];

        for(int i = 0; i < row; i++){
            for (int  k = 0; k < col; k++){
                System.out.print("Enter the value of [" + i +"] and col [" + col +"]: " );
                arr[i][k] = scanner.nextInt();
            }
        }
        System.out.println("The entered array is: ");
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        findMax(arr);
        findMin(arr);
    }

    private static void findMax(int[][] arr) {
        int max = 0;
        for(int i = 0; i < arr.length ; i++){
            for(int k = 0; k < arr[i].length; k++){
                if(arr[i][k] > max)
                    max = arr[i][k];
            }
        }
        System.out.println("The max value of the array is " + max);
    }
    private static void findMin(int[][] arr) {
        int min = arr[0][0];
        for(int i = 0; i < arr.length ; i++){
            for(int k = 0; k < arr[i].length; k++){
                if(arr[i][k] < min)
                    min = arr[i][k];
            }
        }
        System.out.println("The min value of the array is " + min);
    }
}