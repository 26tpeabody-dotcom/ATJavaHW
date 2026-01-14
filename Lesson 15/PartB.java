//Teagan Peabody
//AT Java
//Lesson 15 Part B

import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[20];
        int count = 0;      
        System.out.println("Enter up to 20 integer values (type 'q' when done):");
        while (count < 20) {
            System.out.print("Enter an integer value or 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();  // skip over the 'q'
                break;         // exit loop
            } else {
                numbers[count] = input.nextInt();
                count++;
            }
        }
        // Print elements separated by commas
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Prompt for target integer value
        System.out.print("Enter a target integer value: ");
        int target = input.nextInt();
        // Count occurrences of target value
        int occurrences = 0;
        for (int i = 0; i < count; i++) {
            if (numbers[i] == target) {
                occurrences++;
            }
        }
        // Print the result
        System.out.printf("The value %d occurs %d times in your original data set.%n", target, occurrences);
        input.close();      
    }
}

