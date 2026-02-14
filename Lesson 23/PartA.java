//Teagan Peabody
//AT Java
//Lesson 22 Part A

import java.util.Scanner;   
public class PartA {
    public static int getQuizScore(Scanner in) {
        System.out.print("Enter a quiz score (0-100): ");
        int score = in.nextInt();
        if (score < 0 || score > 100) {
            throw new ArithmeticException("Invalid quiz score. Score must be between 0 and 100.");
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int quizScore = getQuizScore(scanner);
            System.out.println("You entered a valid quiz score: " + quizScore);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
