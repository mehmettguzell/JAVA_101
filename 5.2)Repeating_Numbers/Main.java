import java.util.Arrays;

public class Main {
    static boolean isFind (int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {10, 15, 25, 10, 45, 15, 25,10 ,5, 105, 45, 10, 25};
        int [] duplicate = new int[arr.length];
        int startIndex = 0;

        for(int i = 0; i < arr.length; i++){
            for (int k = 0; k < arr.length; k++){
                if((i != k) && (arr[i] == arr[k])){
                    if (!isFind(duplicate, arr[i]))
                        duplicate[startIndex ++] = arr[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
        for (int value : duplicate){
            if(value != 0){
                System.out.print(value +" ");
            }
        }
    }
}