//Teagan Peabody
//AT Java
//Manipulating Arrays Part A

import java.util.Scanner;

public class PartA {
    public static int remove(double[]array,int currentSize,int targetIndex)
    {if(targetIndex<0||targetIndex>=currentSize){
        return currentSize; // Index out of bounds, do nothing
    }for(int i=targetIndex;i<currentSize-1;i++){
        array[i]=array[i+1]; // Shift elements to the left
    }return currentSize-1; // Decrease size by 1
    }
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

        //print corrent array contents
        System.out.println("Current scores:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%.2f ", scores[i]);
        }
        System.out.println();   
        //ask user which index to remove
        System.out.println("Enter the index of the score to remove (0 to " + (count - 1) + "):");
        int indexToRemove = scanner.nextInt();
        count = remove(scores, count, indexToRemove);
        //print updated array contents and count
        System.out.println("Number of scores entered: " + count);
        System.out.println("Updated scores:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%.2f ", scores[i]);
        }
        System.out.println();

    scanner.close();
}
}


