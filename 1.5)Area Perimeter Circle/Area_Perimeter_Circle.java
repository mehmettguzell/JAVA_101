import java.util.Scanner;

public class Area_Perimeter_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("r = "); int r = scanner.nextInt();
        double area = FindArea(r);
        double perimeter = FindPerimeter(r);
        System.out.println("area : " + area + " perimeter : " + perimeter);

    }

    private static double FindPerimeter(int r) {
        return Math.PI * 2 * r;
    }
    private static double FindArea(int r) {
        return Math.PI * r *r;
    }
}