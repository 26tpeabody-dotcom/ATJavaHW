import java.util.Scanner;
import mow.Mower;
import mow.Yard;

public class PartC {
    public static void main(String[] args) {
        clearScreen();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the height of the lawn: ");
            int height = scanner.nextInt();

            System.out.print("Enter the width of the lawn: ");
            int width = scanner.nextInt();

            Yard yard = new Yard(height, width);
            Mower mower = new Mower(1, 1, 1);
            mower.randomizeMower(yard);

            while (mower.updateMower(yard)) {
                clearScreen();
                mower.cutGrass(yard);
                yard.printYard(mower);
                delay(500);
            }

            clearScreen();
            yard.printYard(mower);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J\033[3J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }
}
