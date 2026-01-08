//Teagan Peabody
//AT Java
//In class challenge 1/6

import java.util.Scanner;
public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        int count = 0;
        
        System.out.println("Enter up to 10 test scores (or 'Q' to quit):");
        
        while (count < 10) {
            String input = scanner.nextLine(); 
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            else {
            double score = Double.parseDouble(input);
            scores[count] = score;
            count++;
        }
        }
            double sum = 0;
            double max = scores[0];
            for (int i = 0; i < count; i++) {
                sum += scores[i];
                if (scores[i] > max) {
                    max = scores[i];
                }
            }
            double average = sum / count;
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Maximum score: %.2f%n", max);
            System.out.println("Number of scores entered: " + count);
        
        scanner.close();
    }
}
