
//Teagan Peabody
//AT Java
//Lesson 22 Part B

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        try {
            File file = new File("birthyears.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                String name = parts[0].trim();
                String birthYearStr = parts[1].trim();

                try {
                    int birthYear = Integer.parseInt(birthYearStr);
                    System.out.println(name + " was born in " + birthYear + ".");
                } catch (NumberFormatException e) {
                    System.out.println("I do not know what year " + name + " was born.");
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
