import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    HashMap<String, Double> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addProduct(String fruit, double weight) {
        if (Main.getProductPrices().containsKey(fruit)) {
            if (items.containsKey(fruit)) {
                double currentWeight = items.get(fruit);
                double updatedWeight = currentWeight + weight;
                items.put(fruit, updatedWeight);
                System.out.println(updatedWeight + " kg " + fruit + " added to your cart\n");
            } else {
                items.put(fruit, weight);
                System.out.println(weight + " kg " + fruit + " in your cart");
            }
        } else System.out.println("This product is not available in the grocery store.\n");
    }

    public void deleteProduct(String fruit, double weight) {
        if (Main.getProductPrices().containsKey(fruit)) {
            if (items.containsKey(fruit)) {
                double currentWeight = items.get(fruit);
                double updatedWeight = currentWeight - weight;
                if (updatedWeight <= 0) {
                    items.remove(fruit);
                    System.out.println("There are no " + fruit + " products left in your card.");
                } else {
                    items.put(fruit, updatedWeight);
                    System.out.println(weight + " kg" + fruit + " were removed from the basket.");
                }
            } else System.out.println("There is no " + fruit + " in your cart.");
        } else System.out.println("There is no " + fruit + " in the grocery store");
    }

    public void printReceipt() {
        double totalPrice = 0.0;
        System.out.println("\nReceipt");
        System.out.println("--------");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            String fruit = entry.getKey();
            double weight = entry.getValue();
            double pricePerKg = Main.getProductPrices().get(fruit);
            double totalPriceForItem = weight * pricePerKg;
            System.out.println(fruit + ": " + weight + " -> " + totalPriceForItem + "TL");
            totalPrice += totalPriceForItem;
        }
        System.out.println("------------");
        System.out.println("Total Price: " + totalPrice + " Tl");
    }
}
