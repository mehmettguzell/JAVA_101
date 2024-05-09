import java.util.InputMismatchException;
import java.util.Scanner;

public class Body_Mass_Index_Calculating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight = 0, height = 0;

        try {
            System.out.print("Please enter your height (in meters): ");
            float userInputHeight = scanner.nextFloat();
            if (userInputHeight > 0 && userInputHeight < 300) {
                if (userInputHeight > 3) {
                    height = userInputHeight / 100;
                } else height = userInputHeight;
            } else {
                throw new Exception("ARE YOU GIANT ??? Please Check Your height");
            }

            System.out.print("Please enter your weight (in kg): ");
            float userInputWeight = scanner.nextFloat();
            if (userInputWeight > 0 && userInputWeight < 1000) {
                weight = userInputWeight;
            } else {
                throw new Exception("I am sorry for you ");
            }

            float bodyMass = CalculateBodyMassIndex(height, weight);
            System.out.println("Your Body Mass Index: " + bodyMass);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    private static float CalculateBodyMassIndex(float height, float weight) {
        float bodyMass = weight / (height * height);
        return bodyMass;
    }
}