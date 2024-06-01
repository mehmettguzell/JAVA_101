import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][]arr = {{2, 3, 4}, {5, 6, 4}};
        int [][]temp = new int[arr[0].length][arr.length];
        for (int i = 0 ; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                temp[k][i] = arr[i][k];
            }
        }
        System.out.println("Matrix: ");
        printMatrix(arr);
        System.out.println("Transpose: ");
        printMatrix(temp);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] value : matrix) {
            for (int i : value){
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}