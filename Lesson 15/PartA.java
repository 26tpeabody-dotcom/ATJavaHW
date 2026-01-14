//Teagan Peabody
//AT Java
//Lesson 15 Part A

import java.util.Scanner;
import java.util.Arrays;
public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Enter up to 10 integer values (type 'q' when done):");

        while (count < 10) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            numbers[count] = Integer.parseInt(input);
            count++;
        }

        // Print elements with asterisks
        System.out.print("*");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + "*");
        }
        System.out.println();

        // Sort the array
        Arrays.sort(numbers, 0, count);

        // Print elements in reverse order separated by commas
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        scanner.close();
    }
}

