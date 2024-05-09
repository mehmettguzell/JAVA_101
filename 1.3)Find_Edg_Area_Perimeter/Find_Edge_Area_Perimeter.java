import java.util.Scanner;
public class Find_Edge_Area_Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edge1, edge2;
        System.out.print("Edge1 :"); edge1 = scanner.nextInt();
        System.out.print("Edge2 :"); edge2 = scanner.nextInt();
        double edge3 = findEdge(edge1,edge2);
        System.out.println("\nThe Edge3: " + edge3);
        System.out.println();

        int choice = menu();
        while(choice != 0 ) {
            switch (choice)
            {
                case 1:
                    double perimeter = findPerimeter(edge1, edge2, edge3);
                    System.out.println("The perimeter is: " + perimeter);
                    break;
                case 2:
                    double area = findArea(edge1, edge2, edge3);
                    System.out.println("The area is: " + area);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("!Invalid choice!");
                    break;
            }
            System.out.println();
            choice = menu();
        }
    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("-----------------");
        System.out.println("1) Find the perimeter");
        System.out.println("2) Find the Area");
        System.out.println("0) !! QUIT !!");
        System.out.println("-----------------");
        System.out.print("Your choice: "); choice = scanner.nextInt();
        System.out.println();

        return choice;
    }
    private static double findEdge(int edge1, int edge2){
        double edge3 = Math.sqrt((edge1 * edge1) + (edge2 * edge2));
        return edge3;
    }
    private static double findPerimeter(int edge1, int edge2, double edge3){
        return edge1 + edge2 + edge3;
    }
    private static double findArea(int edge1, int edge2, double edge3) {
        double u = (edge1 + edge2 + edge3) / 2;
        return u * (u-edge1) * (u-edge2) *(u-edge3);
    }
}