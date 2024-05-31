public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("average : " + (sum / arr.length));
    }
}