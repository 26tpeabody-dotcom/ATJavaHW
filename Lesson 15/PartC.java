//Teagan Peabody
//AT Java
//Lesson 15 Part C

import java.util.Arrays;
import java.util.Random;
public class PartC {
    public static void main(String[] args) {
        final int SIZE = 10000;
        int[] numbers = new int[SIZE];
        Random rand = new Random(); 
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = rand.nextInt(SIZE) + 1; 
        }
        Arrays.sort(numbers);
        int testRuns = 10;
        long totalLinearTime = 0;
        long totalBinaryTime = 0;
        for (int i = 0; i < testRuns; i++) { 
            long startLinear = System.nanoTime();
            long endLinear = System.nanoTime();
            totalLinearTime += (endLinear - startLinear);   
            long startBinary = System.nanoTime();
            long endBinary = System.nanoTime();
            totalBinaryTime += (endBinary - startBinary);
        }
        System.out.printf("Average time for linear search: %.2f ns%n", (double) totalLinearTime / testRuns);
        System.out.printf("Average time for binary search: %.2f ns%n", (double) totalBinaryTime / testRuns);
    }
    public static boolean linearSearch(int[] array, int tgtVal) {
        for (int value : array) {
            if (value == tgtVal) {
                return true;
            }
        }
        return false;
    }
}   