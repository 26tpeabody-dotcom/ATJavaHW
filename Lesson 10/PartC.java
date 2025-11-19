//Teagan Peabody
//AT Java
//Lesson 10 Part C

import java.util.Scanner;
public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for name.
        System.out.print("Enter student name: ");
        String name = in.nextLine();
        int total = 0;
        // BUG 1: min initialized to 0 will be incorrect when all scores are >0.
        // It should be initialized to a large value so the first score becomes the min.
        // Original buggy code:
        // int min = 0;
        int min = Integer.MAX_VALUE;
        int max = -1;
        final int COUNT = 4;

        for (int i = 1; i <= COUNT; i++) {
            System.out.print("Enter score " + i + " (0-100): ");
            int s = in.nextInt();

            // BUG 2: The validation condition uses && which can never be true.
            // A number cannot be both < 0 and > 100. Use || to detect out-of-range values.
            // Original buggy code:
            // if (s < 0 && s > 100) {
            // if (s < 0)
            // s = 0;
            // if (s > 100)
            // s = 100;
            // }
            if (s < 0 || s > 100) {
                if (s < 0)
                    s = 0;
                if (s > 100)
                    s = 100;
            }

            if (s < min)
                min = s;
            if (s > max)
                max = s;

            total += s;
        }

        // BUG 3: Integer division occurs before casting, losing fractional part.
        // Cast numerator or denominator to double before division.
        // Original buggy code:
        // double avg = (double) (total / COUNT);
        double avg = (double) total / (double) COUNT;

        // BUG 4: There was an accidental semicolon after the if, causing passed to always be set true. Fix the logic to set passed correctly based on the average.
        // Original buggy code:
        // boolean passed = false;
        // if (avg >= 60)
        // ;
        // {
        // passed = true;
        // }
        boolean passed = false;
        if (avg >= 60) {
            passed = true;
        } else {
            passed = false;
        }

        char letter = 'F';
        if (avg >= 90) {
            letter = 'A';
        } else if (avg >= 80) {
            letter = 'B';
        } else if (avg >= 70) {
            letter = 'C';
        } else if (avg >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }

        System.out.println("\n----- Report -----");
        System.out.println("Name: " + name);
        System.out.println("Highest single score recorded: " + max);
        System.out.println("Lowest single score recorded: " + min);
        System.out.println("Passed? " + passed);
        System.out.printf("Average: %.2f\n", avg);
        System.out.println("Letter grade: " + letter);

        in.close();
    }
}
