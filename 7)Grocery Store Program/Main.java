import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final ShoppingCart shoppingCart = new ShoppingCart();
    private static HashMap<String, Double> productPrices = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = menu();

        InitFruitePrices();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    try{
                        System.out.print("Which fruit do you want: ");
                        String fruit = scanner.nextLine().toLowerCase();
                        System.out.print("How many kg fruit do you want: ");
                        double weight = scanner.nextDouble();
                        shoppingCart.addProduct(fruit, weight);
                    }catch (InputMismatchException e){
                        System.err.println("Invalid inpput. Please enter a valid number ");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Which fruit do you want to reduce: ");
                        String fruit = scanner.nextLine().toLowerCase();

                        System.out.print("How many kg fruit do you want to reduce: ");
                        double weight = scanner.nextDouble();
                        scanner.nextLine();

                        shoppingCart.deleteProduct(fruit, weight);
                    } catch (InputMismatchException e) {
                        System.err.println("Invalid input. Please enter a valid number.");
                    }
                    break;

                case 3:
                    shoppingCart.printReceipt();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.println();
            choice = menu();
        }
    }

    public static HashMap<String, Double> getProductPrices() {
        return productPrices;
    }

    public static void setProductPrices(HashMap<String, Double> productPrices) {
        Main.productPrices = productPrices;
    }

    private static void InitFruitePrices() {
        productPrices.put("pear", 2.14);
        productPrices.put("apple", 3.67);
        productPrices.put("tomato", 1.11);
        productPrices.put("banana", 0.95);
        productPrices.put("eggplant", 5.00);
    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("1) Add fruit and fruit's kg ");
        System.out.println("2) Reducing fruit's kg ");
        System.out.println("3) Print Receipt ");
        System.out.println("0) Quit ");
        System.out.println("-------------------");
        System.out.print("Your choice: ");
        try {
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } catch (InputMismatchException e) {
            System.err.println("!!Please enter valid choice!!");
            scanner.nextLine();
            System.out.println();
            return menu();

        }
    }
}