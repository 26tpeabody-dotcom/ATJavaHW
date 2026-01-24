//Teagan Peabody
//AT Java
//Lesson 18 Part B

import java.util.ArrayList;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a test score (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            double score = Double.parseDouble(input);
            scores.add(score);
        }

        System.out.println("Scores entered:");
        double total = 0;
        for (Double score : scores) {
            System.out.printf("%.2f%n", score);
            total += score;
        }

        if (!scores.isEmpty()) {
            double average = total / scores.size();
            System.out.printf("Average score: %.2f%n", average);
        } else {
            System.out.println("No scores were entered.");
        }

        scanner.close();
    }
}

