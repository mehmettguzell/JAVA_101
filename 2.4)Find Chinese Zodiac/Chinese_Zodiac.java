import java.util.Scanner;

public class Chinese_Zodiac {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter the year of you birth (or type 'exit' to quit):  ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                exit = true;
                continue;
            } else {
                try {
                    int birthYear = Integer.parseInt(input);
                    String zodiacSign = calculateZodiac(birthYear);
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacSign);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a number" + "\n");
                }
            }
        }
        scanner.close();
    }
    private static String calculateZodiac(int birthYear) {
        String[] zodiacSigns = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox",
                "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        return zodiacSigns[birthYear % 12];
    }
}