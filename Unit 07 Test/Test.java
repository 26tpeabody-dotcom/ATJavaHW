//Teagan Peabody
//AT Java
//Unit 7 Practical Test 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        String fileName = "mathmeet.txt";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.printf("%-12s | %-18s | %s%n", "Name", "School", "Score");
            System.out.println("-----------------------------------------------------");

            double totalScore = 0;
            int count = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(","); 
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String school = parts[1].trim();
                    double score = Double.parseDouble(parts[2].trim());

                    System.out.printf("%-12s | %-18s | %.1f%n", name, school, score);
                    totalScore += score;
                    count++;
                }
            }

            System.out.println("-----------------------------------------------------");
            if (count > 0) {
                double averageScore = totalScore / count;
                System.out.printf("Average Score: %.1f%n", averageScore);
            } else {
                System.out.println("No data to calculate average score.");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}