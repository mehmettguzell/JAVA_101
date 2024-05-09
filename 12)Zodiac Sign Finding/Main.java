import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your day of birth: ");
        int day = scanner.nextInt();
        System.out.print("Enter your month of birth as a number: ");
        int month = scanner.nextInt();

        String zodiacSign = findZodiacSign(day, month);
        if(zodiacSign != null)
            System.out.println("Your zodiac sign: " + zodiacSign);
        else
            System.out.println("You entered invalid date");
    }

    private static String findZodiacSign(int day, int month) {
        String[] zodiacSigns = {"Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer",
                                 "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"};
        int[] startDates = {20, 19, 20, 20, 21, 22, 22, 22, 22, 21, 21, 20};

        if(day < 1 || day > 31 || month < 1 || month > 12){
            return null;
        }

        int index = month - 1;
        if(day < startDates[index]){
            index = ((index - 1) + 12) % 12;
        }
        return zodiacSigns[index];
    }
}