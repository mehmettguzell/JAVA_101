import java.util.Scanner;

public class Suggesting_Activites_Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many temperature inputs would you like to make? ");
        int numOfTemperatures = scanner.nextInt();

        for(int i = 0; i <= numOfTemperatures; i++){
            System.out.print("Temperature " + (i+1) +": ");
            int heat = scanner.nextInt();
            recommendActivity(heat);
        }
        scanner.close();
    }
    private static void recommendActivity(int heat) {
        if (heat < 5)
            System.out.println("Temperature is very low, you can go skiing.");
        else if (heat <= 15)
            System.out.println("You can go to the cinema.");
        else if (heat <= 25)
            System.out.println("You can go for a picnic.");
        else
            System.out.println("The weather is hot, perfect for swimming.");
    }
}
