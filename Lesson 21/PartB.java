//Teagan Peabody
//AT Java
//Lesson 21 Part B

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sales_by_cat.txt");
        Scanner scanner = new Scanner(file);    
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            String deptName = parts[0].trim();
            String managerName = parts[1].trim();
            String salesData = parts[2].trim();

            double salesRevenue;
            if (salesData.equalsIgnoreCase("n/a")) {
                salesRevenue = 0.00;
            } else {
                salesRevenue = Double.parseDouble(salesData);
            }

            System.out.printf("%-17s | %-10s | $ %10.2f%n", deptName, managerName, salesRevenue);
        }
        scanner.close();
    }
}
