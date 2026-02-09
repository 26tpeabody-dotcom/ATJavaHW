//Teagan Peabody
//AT Java
//Lesson 21 Part A

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Top5Unemployment.txt");
        Scanner scanner = new Scanner(file);

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            String country = parts[0].trim();
            double unemploymentRate = Double.parseDouble(parts[1].trim());
            int ranking = Integer.parseInt(parts[2].trim());
            String region = parts[3].trim();

            System.out.printf("Ranked # %2d: %-17s | %6.2f%% | %-20s%n", ranking, country, unemploymentRate, region);
        }

        System.out.println("---------------------------------------------------------------");
        scanner.close();
    }
}

