//Teagan Peabody
//AT Java
//Lesson 24 part B

import java.util.Scanner;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }
}

public class PartB {
    public static void main(String[] args) {
        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();

        Scanner in = new Scanner(System.in);
        String input;

        System.out.println("Enter 'c' for cake, 'p' for pie, or 'q' to quit:");

        while (true) {
            input = in.nextLine();

            if (input.equals("c")) {
                cakeCounter.increment();
            } else if (input.equals("p")) {
                pieCounter.increment();
            } else if (input.equals("q")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'c', 'p', or 'q'.");
            }
        }

        System.out.println("Total votes for cake: " + cakeCounter.getValue());
        System.out.println("Total votes for pie: " + pieCounter.getValue());

        in.close();
    }
}