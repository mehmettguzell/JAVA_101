import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 25, 35, 45, 5, 10, 55, 5};
        boolean[] counted = new boolean[arr.length];

        System.out.println("The Array " + Arrays.toString(arr));
        System.out.println("Repeated Numbers");

        for (int i = 0; i < arr.length; i++) {
            if(counted[i])
                continue;
            int counter = 0;

            for (int k = 0; k < arr.length; k++) {
                if (i != k && arr[i] == arr[k]) {
                    counter++;
                    counted[k] = true;
                }
            }
            if (counter > 0) {
                System.out.println(arr[i] + " repeated " + (counter + 1) + " times");
            }
        }
    }
}