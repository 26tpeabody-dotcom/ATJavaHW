//Teagan Peabody
//AT Java
//Lesson 16 Part B

import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[100];
        int count = 0;  
        System.out.println("Enter quiz scores (type 'q' to quit):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            double score = Double.parseDouble(input);
            scores[count++] = score;
        }   
        double[] filledScores = java.util.Arrays.copyOf(scores, count);
        double avg = average(filledScores);
        System.out.printf("The average of the entered quiz scores is: %.2f%n", avg);
        scanner.close();
    }
    public static double average(double... values) {
        if (values.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}