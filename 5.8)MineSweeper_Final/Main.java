import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 5;
    static final int MINES = 5;
    static char[][] board = new char[SIZE][SIZE];
    static boolean[][] mineLocations = new boolean[SIZE][SIZE];
    static int remainingCells;

    public static void main(String[] args) {
        initializeBoard();
        placeMines();
        printMineLocations();
        System.out.println();

        remainingCells = SIZE * SIZE - MINES;
        Scanner scanner = new Scanner(System.in);
        while (remainingCells > 0) {
            printBoard();
            System.out.println("Enter row and column (e.g., 1 2): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            if (isValid(row, col)) {
                if (mineLocations[row][col]) {
                    System.out.println("Game Over. You hit a mine.");
                    revealMines();
                    printBoard();
                    break;
                } else {
                    revealCell(row, col);
                    if (remainingCells == 0) {
                        System.out.println("Congratulations! You cleared the minefield!");
                        printBoard();
                        break;
                    }
                }
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        scanner.close();
    }

    private static void revealCell(int row, int col) {
        if (mineLocations[row][col])
            return;
        int count = countAdjacentMines(row, col);

        board[row][col] = count == 0 ? ' ' : (char) (count + '0');
        remainingCells--;
        if (count == 0) {
            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    if (isValid(i, j) && board[i][j] == '-') {
                        revealCell(i, j);
                    }
                }
            }
        }
    }

    private static int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int k = col - 1; k <= col + 1; k++) {
                if (i >= 0 && i < SIZE && k >= 0 && k < SIZE && mineLocations[i][k])
                    count++;
            }
        }
        return count;
    }

    private static void revealMines() {
        for (int i = 0; i < SIZE; i++) {
            for (int k = 0; k < SIZE; k++) {
                if (mineLocations[i][k]) {
                    board[i][k] = '*';
                }
            }
        }
    }

    private static boolean isValid(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == '-';
    }

    private static void printBoard() {
        System.out.println("    1  2  3  4  5");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "   ");
            for (int k = 0; k < SIZE; k++) {
                System.out.print(board[i][k] + "  ");
            }
            System.out.println();
        }
    }

    private static void placeMines() {
        Random random = new Random();
        int count = 0;
        while (count < MINES) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);
            if (!mineLocations[row][col]) {
                mineLocations[row][col] = true;
                count++;
            }
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int k = 0; k < SIZE; k++) {
                board[i][k] = '-';
            }
        }
    }

    private static void printMineLocations() {
        System.out.println("Mine Locations:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (mineLocations[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
