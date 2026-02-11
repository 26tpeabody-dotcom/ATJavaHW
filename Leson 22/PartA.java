//Teagan Peabody
//AT Java
//Lesson 22 Part A

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filename;

        while (true) {
            System.out.print("Please enter a filename or '#' to quit: ");
            filename = input.nextLine();

            if (filename.equals("#")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                File file = new File(filename);
                Scanner fileScanner = new Scanner(file);

                while (fileScanner.hasNext()) {
                    String word = fileScanner.next();
                    System.out.println(word);
                }

                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found. Please try again.");
            }
        }

        input.close();
    }
}