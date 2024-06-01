import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MAX_GUESSES = 5;
    private static final int MAX_NUMBER = 100;
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int remainingGuesses = MAX_GUESSES;
        boolean isWin = false;
        int [] guesses = new int[MAX_GUESSES];

        System.out.println("I chose a number between 0 and " + MAX_NUMBER + "You have a " + MAX_GUESSES + " guesses.");
        System.out.println(number);

        while(remainingGuesses > 0){
            System.out.print("Enter your Guess: ");
            int guess = input.nextInt();

            if(guess < 0 || guess > 100){
                System.out.println("Invalid number entry");
                continue;
            }
            guesses[MAX_NUMBER - remainingGuesses] = guess;

            if(guess == number){
                isWin = true;
                System.out.println("YOU WIN. The number is " + number);
                break;
            } else if (guess < number) {
                System.out.println("Please enter a larger number.");
            }else {
                System.out.println("Please enter a smaller number.");
            }
            remainingGuesses--;
            System.out.println("your remaining guesses: " + remainingGuesses);

            if (remainingGuesses == 0){
                System.out.println("sorry you couldn't find the entered number. The number is " + number);
            }
            System.out.println("Your Guesses: ");
            for(int i = 0; i < MAX_GUESSES - remainingGuesses; i++){
                System.out.print(guesses[i] + " ");
            }
        }
        input.close();
    }
}