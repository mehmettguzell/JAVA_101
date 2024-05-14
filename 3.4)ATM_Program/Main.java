import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int choice;

        while (right > 0) {
            System.out.print("Your Username: ");
            userName = scanner.nextLine();
            System.out.print("Your Password: ");
            password = scanner.nextLine();

            if (userName.equals("naber") && password.equals("mudur")) {
                System.out.println("\n..Welcome..");
                do {
                    System.out.println("1)Deposit\n2)Withdraw\n3)Balance inquiry" +
                            "\n4)Exit");
                    System.out.println(".................");
                    System.out.print("Choice: ");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            int depositAmount = scanner.nextInt();
                            balance += depositAmount;
                            System.out.println("transaction successful!\n");
                            break;
                        case 2:
                            System.out.print("Enter deposit amount: ");
                            int withdrawAmount = scanner.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("You don't have enough money\n");
                            } else {
                                balance -= withdrawAmount;
                                System.out.println("transaction successful!\n");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance + "\n");
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Please select a valid option\n");
                    }
                } while (choice != 4);
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. PLease Try again.");
                if (right == 0) {
                    System.out.println("YOUR CARD IS BLOCKED");
                } else {
                    System.out.println("Your remaining right: " + right);
                }

            }
        }
    }
}