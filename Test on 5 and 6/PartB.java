
import java.util.ArrayList;
import java.util.Scanner;
public class PartB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> quizScores = new ArrayList<>();
        String input;

        while (true) {
            System.out.print("Enter a quiz score (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            double score = Double.parseDouble(input);
            quizScores.add(score);
        }

        System.out.println("------------------------------------------");
        System.out.println("Quiz Scores:");
        double total = 0.0;
        for (double score : quizScores) {
            System.out.printf("%10.2f%n", score);
            total += score;
        }
        System.out.println("------------------------------------------");

        if (!quizScores.isEmpty()) {
            double average = total / quizScores.size();
            System.out.printf("Average Quiz Score: %.2f%n", average);
        } else {
            System.out.println("No quiz scores were entered.");
        }

        scanner.close();
    }
}