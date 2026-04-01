//Teagan Peabody
//AT Java
//Mower Project Part A

import java.util.Scanner;
import mow.Yard;

public class PartA {
    public static void main(String[] args) {
        clearScreen();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the height of the yard: ");
            int height = scanner.nextInt();

            System.out.print("Enter the width of the yard: ");
            int width = scanner.nextInt();

            Yard yard = new Yard(height, width);
            yard.printYard();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J\033[3J");
        System.out.flush();
    }
}
