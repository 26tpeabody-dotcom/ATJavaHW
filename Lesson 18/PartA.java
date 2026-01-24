//Teagan Peabody
//AT Java
//Lesson 18 Part A

import java.util.ArrayList;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a name (or # to quit): ");
            input = scanner.nextLine();
            if (input.equals("#")) {
                break;
            }
            names.add(input);
        }

        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
