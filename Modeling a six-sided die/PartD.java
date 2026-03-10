//Teagan Peabody
//AT Java
//Modeling a six-sided die

import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VirtualDie die = new VirtualDie();

        while (true) {
            System.out.print("Enter 'r' to roll, 'd' to display,or 'q' to quit: ");
            String input = scanner.nextLine().trim().toLowerCase();
            
            if (input.isEmpty()) {
                System.out.println("Invalid input. Please enter 'r', 'd', or 'q'.");
            }

            char command = input.charAt(0);

            if (command == 'r') {
                die.roll();
                System.out.println("die was rolled. value = " + die.getValue());
            } else if (command == 'd') {
                printDieFace(die.getValue());
            } else if (command == 'q') {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'r', 'd', or 'q'.");
            }
        }

        scanner.close();
    }

    private static void printDieFace(int value) {
        String[] lines = new String[5];
        lines[0] = "+-------+";

        switch (value) {
            case 1:
                lines[1] = "|       |";
                lines[2] = "|   0   |";
                lines[3] = "|       |";
                break;
            case 2:
                lines[1] = "| 0     |";
                lines[2] = "|       |";
                lines[3] = "|     0 |";
                break;
            case 3:
                lines[1] = "| 0     |";
                lines[2] = "|   0   |";
                lines[3] = "|     0 |";
                break;
            case 4:
                lines[1] = "| 0   0 |";
                lines[2] = "|       |";
                lines[3] = "| 0   0 |";
                break;
            case 5:
                lines[1] = "| 0   0 |";
                lines[2] = "|   0   |";
                lines[3] = "| 0   0 |";
                break;
            case 6:
                lines[1] = "| 0   0 |";
                lines[2] = "| 0   0 |";
                lines[3] = "| 0   0 |";
                break;
            default:
                lines[1] = "|       |";
                lines[2] = "|       |";
                lines[3] = "|       |";
                break;
        }

        lines[4] = "+-------+";

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
