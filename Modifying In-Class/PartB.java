//Teagan Peabody
//AT Java
//Manipulating Arrays Part B

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        int count = 0;

        System.out.println("Enter up to 10 test scores (or 'Q' to quit):");

        while (count < 10) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                break;
            } else {
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

        //print current array contents
        System.out.println("Current scores:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%.2f ", scores[i]);
        }
        System.out.println();   
        //ask user for index to insert new score
        System.out.println("Enter the index to insert a new score (0 to " + count + "):");
        int indexToInsert = scanner.nextInt();
        System.out.println("Enter the new score to insert:");
        double newScore = scanner.nextDouble();
        count = insert(scores, count, indexToInsert, newScore);
        //print updated array contents and count
        System.out.println("Number of scores entered: " + count);
        System.out.println("Updated scores:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%.2f ", scores[i]);
        }
        System.out.println();
        
    scanner.close();
}

public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {
        if (targetIndex < 0 || targetIndex > currentSize || currentSize >= array.length) {
            return currentSize; // Index out of bounds or no space, do nothing
        }
        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1]; // Shift elements to the right
        }
        array[targetIndex] = newElement; // Insert new element
        return currentSize + 1; // Increase size by 1
    }
}