//Teagan Peabody
//AT Java
//Lesson 20 part B

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("characters.txt");
        Scanner scanner = new Scanner(file);

        int totalChars = 0;
        int letterCount = 0;
        int digitCount = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                totalChars++;
                if (Character.isLetter(ch)) {
                    letterCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }
        }

        scanner.close();

        System.out.println("count = " + totalChars);
        System.out.println("letters = " + letterCount);
        System.out.println("digits = " + digitCount);
    }
}