public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("m", 20, 100, 88, 50);
        Fighter f2 = new Fighter("a", 20, 89, 90,50);

        Ring ring = new Ring(f1, f2, 87, 90);
        ring.run();
    }
}