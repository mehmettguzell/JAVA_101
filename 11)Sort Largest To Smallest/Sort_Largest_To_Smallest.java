import java.util.Scanner;

public class Sort_Largest_To_Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double[] sortedNumbers = sortedNumbers(num1, num2, num3);

        System.out.println("Numbers in ascending order: " + sortedNumbers[0] + " "
                + sortedNumbers[1] + " "
                + sortedNumbers[2]);
        scanner.close();

    }

    /**
     * Insertion Sort
     **/
    private static double[] sortedNumbers(double num1, double num2, double num3) {
        double[] insertionSort = new double[]{num1, num2, num3};
        for (int i = 1; i < insertionSort.length; i++) {
            double key = insertionSort[i];
            int k = i - 1;
            while (0 <= k && insertionSort[k] > key) {
                insertionSort[k + 1] = insertionSort[k];
                k--;
            }
            insertionSort[k + 1] = key;
        }
        return insertionSort;
    }


    /**
     * Selection Sorts
     **/
    /*
    //SELECTION
    private static double[] sortedNumbers(double num1, double num2, double num3) {
        double[] selectionSort = new double[]{num1, num2, num3};
        for(int i = 0; i< selectionSort.length; i++){
            int min = i;
            for (int k = i+1; k< selectionSort.length; k++){
                if(selectionSort[k] < selectionSort[min])
                    min = k;
            }
            double temp = selectionSort[min];
            selectionSort[min] = selectionSort[i];
            selectionSort[i] = temp;
        }
        return selectionSort;
    }*/
}