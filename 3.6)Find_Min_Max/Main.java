import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many integers, do you want to enter: ");
        int numberCount = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int  i = 0; i < numberCount; i++){
            System.out.print("Number " + (i+1) + " : ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        int min = 0;
        int max = 0;
        for(int i = 1 ; i < numbers.size(); i++){
            if (numbers.get(i) > numbers.get(max))
                max = i;
            if(numbers.get(i) < numbers.get(min))
                min = i;
        }
        System.out.println("The max number: " + numbers.get(max));
        System.out.println("The min number: " + numbers.get(min));
    }
}