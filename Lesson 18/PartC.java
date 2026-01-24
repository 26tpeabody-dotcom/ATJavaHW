//Teagan Peabody
//AT Java
//Lesson 18 Part C

import java.util.ArrayList; 
import java.util.Scanner;
public class PartC {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter a temperature (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            int temp = Integer.parseInt(input);
            temperatures.add(temp);
        }
        if (temperatures.isEmpty()) {
            System.out.println("No temperatures were entered.");
            scanner.close();
            return;
        }
        int lowest = temperatures.get(0);
        for (int temp : temperatures) {
            if (temp < lowest) {
                lowest = temp;
            }
        }
        System.out.println("Temperatures entered:");
        for (int temp : temperatures) {
            if (temp == lowest) {
                System.out.println(temp + " <= lowest");
            } else {
                System.out.println(temp);
            }
        }
        scanner.close();
    }
}
