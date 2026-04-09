import mow.Mower;
import mow.Yard;

public class PartB {
    public static void main(String[] args) {
        Yard yard = new Yard(5, 24);
        Mower mower = new Mower(3, 1, 1);

        while (mower.getCol() < yard.getLawnWidth()) {
            clearScreen();
            mower.cutGrass(yard);
            yard.printYard(mower);
            delay(500);
            mower.moveForward();
        }

        clearScreen();
        mower.cutGrass(yard);
        yard.printYard(mower);
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
