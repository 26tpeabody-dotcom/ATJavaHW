//Teagan Peabody
//AT Java
//Minsweeper Game

import java.util.Random;
import java.util.Scanner;

public class Game {
    // Constants
    private static final int ROWS = 9;
    private static final int COLS = 9;
    private static final int NUM_MINES = 10;

    // Game state arrays
    private static char[][] map; // Hidden state with mines and numbers
    private static char[][] board; // Visible state shown to player
    private static boolean gameOver;
    private static boolean gameWon;
    private static int revealedTiles;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize game
        initializeGame();

        // Main game loop
        while (!gameOver) {
            clearScreen();
            displayBoard();

            System.out.println("\nEnter command:");
            System.out.println("  r <row> <col> - Reveal tile");
            System.out.println("  f <row> <col> - Flag/unflag tile");
            System.out.println("  c - Cheat (show map)");
            System.out.println("  q - Quit");
            System.out.print("> ");

            String command = scanner.next().toLowerCase();

            if (command.equals("q")) {
                System.out.println("Thanks for playing!");
                break;
            } else if (command.equals("c")) {
                // Cheat mode - show the map temporarily
                clearScreen();
                System.out.println("=== CHEAT MODE - Map Revealed ===");
                displayMap();
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
                scanner.nextLine();
            } else if (command.equals("r")) {
                // Reveal tile
                if (scanner.hasNextInt()) {
                    int row = scanner.nextInt();
                    int col = scanner.nextInt();
                    revealTile(row, col);
                } else {
                    System.out.println("Invalid input! Use format: r <row> <col>");
                    scanner.nextLine(); // clear invalid input
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }
            } else if (command.equals("f")) {
                // Flag/unflag tile
                if (scanner.hasNextInt()) {
                    int row = scanner.nextInt();
                    int col = scanner.nextInt();
                    flagTile(row, col);
                } else {
                    System.out.println("Invalid input! Use format: f <row> <col>");
                    scanner.nextLine(); // clear invalid input
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Invalid command!");
                scanner.nextLine(); // clear invalid input
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        // Game over - show final result
        if (gameOver) {
            clearScreen();
            displayBoard();
            if (gameWon) {
                System.out.println("\n Congratulations! You won! ");
            } else {
                System.out.println("\n Game Over! You hit a mine! ");
                System.out.println("\nRevealing the map:");
                displayMap();
            }
        }

        scanner.close();
    }

    // Initialize the game by creating the map and board

    private static void initializeGame() {
        map = new char[ROWS][COLS];
        board = new char[ROWS][COLS];
        gameOver = false;
        gameWon = false;
        revealedTiles = 0;

        // Initialize board with hidden tiles
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = '#';
            }
        }

        // Generate the map
        generateMap();
    }

    private static void generateMap() {
        Random random = new Random();

        // Initialize map with blank spaces
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                map[i][j] = ' ';
            }
        }

        // Randomly place mines
        int minesPlaced = 0;
        while (minesPlaced < NUM_MINES) {
            int row = random.nextInt(ROWS);
            int col = random.nextInt(COLS);

            // Only place mine if this location doesn't already have one
            if (map[row][col] != 'm') {
                map[row][col] = 'm';
                minesPlaced++;
            }
        }

        // Calculate numbers for tiles adjacent to mines
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                // Skip if this tile has a mine
                if (map[i][j] == 'm') {
                    continue;
                }

                // Count adjacent mines
                int adjacentMines = countAdjacentMines(i, j);

                if (adjacentMines > 0) {
                    map[i][j] = (char) ('0' + adjacentMines);
                } else {
                    map[i][j] = ' ';
                }
            }
        }
    }

    private static int countAdjacentMines(int row, int col) {
        int count = 0;

        // Check all 8 adjacent positions
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                // Skip the center position
                if (dr == 0 && dc == 0) {
                    continue;
                }

                int newRow = row + dr;
                int newCol = col + dc;

                // Check if position is valid and has a mine
                if (isValidPosition(newRow, newCol) && map[newRow][newCol] == 'm') {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isValidPosition(int row, int col) {
        return row >= 0 && row < ROWS && col >= 0 && col < COLS;
    }

    private static void revealTile(int row, int col) {
        // Check if position is valid
        if (!isValidPosition(row, col)) {
            System.out.println("Invalid position! Row and column must be between 0 and " + (ROWS - 1));
            return;
        }

        // Check if tile is already revealed or flagged
        if (board[row][col] != '#') {
            System.out.println("Tile is already revealed or flagged!");
            return;
        }

        // Reveal the tile
        board[row][col] = map[row][col];

        // Check if player hit a mine
        if (map[row][col] == 'm') {
            gameOver = true;
            gameWon = false;
            return;
        }

        // Increment revealed tiles counter
        revealedTiles++;

        // Check if player won (revealed all non-mine tiles)
        int totalNonMineTiles = (ROWS * COLS) - NUM_MINES;
        if (revealedTiles == totalNonMineTiles) {
            gameOver = true;
            gameWon = true;
        }
    }

    private static void flagTile(int row, int col) {
        // Check if position is valid
        if (!isValidPosition(row, col)) {
            System.out.println("Invalid position! Row and column must be between 0 and " + (ROWS - 1));
            return;
        }

        // Flag tile
        if (board[row][col] == '#') {
            board[row][col] = 'F'; // Flag the tile
        } else if (board[row][col] == 'F') {
            board[row][col] = '#'; // Unflag the tile
        } else {
            System.out.println("Cannot flag a revealed tile!");
        }
    }
    

    private static void displayBoard() {
        System.out.println("\n=== MINESWEEPER ===");
        System.out.println("Mines: " + NUM_MINES + " | Revealed: " + revealedTiles + "/" + ((ROWS * COLS) - NUM_MINES));
        System.out.println();

        // Print column numbers
        System.out.print("   ");
        for (int j = 0; j < COLS; j++) {
            System.out.print(" " + j + " ");
        }
        System.out.println();

        // Print top border
        System.out.print("   ");
        for (int j = 0; j < COLS; j++) {
            System.out.print("---");
        }
        System.out.println();

        // Print board rows
        for (int i = 0; i < ROWS; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < COLS; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println("|");
        }

        // Print bottom border
        System.out.print("   ");
        for (int j = 0; j < COLS; j++) {
            System.out.print("---");
        }
        System.out.println();
    }

    // Display the map (for cheat mode or game over)

    private static void displayMap() {
        System.out.println();

        // Print column numbers
        System.out.print("   ");
        for (int j = 0; j < COLS; j++) {
            System.out.print(" " + j + " ");
        }
        System.out.println();

        // Print top border
        System.out.print("   ");
        for (int j = 0; j < COLS; j++) {
            System.out.print("---");
        }
        System.out.println();

        // Print map rows
        for (int i = 0; i < ROWS; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < COLS; j++) {
                System.out.print(" " + map[i][j] + " ");
            }
            System.out.println("|");
        }

        // Print bottom border
        System.out.print("   ");
        for (int j = 0; j < COLS; j++) {
            System.out.print("---");
        }
        System.out.println();
    }

    //Clear the console screen

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
