//Teagan Peabody
//AT Java
//Lesson 18 Part D --> AT only

import java.util.ArrayList;
import java.util.Scanner;   
public class PartD {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            int number = Integer.parseInt(input);
            numbers.add(number);
        }

        // Remove odd numbers
        for (int i = 0; i < numbers.size(); ) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }

        System.out.println("Modified list (even numbers only):");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}

