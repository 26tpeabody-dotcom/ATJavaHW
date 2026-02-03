//Teagan Peabody
//AT Java
//Lesson 20 part A

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("customerdata.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[,\\s\\n]+");

        System.out.println("---------------------------------------");
        System.out.printf("  %s   |    %s     |     %s \n", "ID", "Name", "Balance");
        System.out.println("---------------------------------------");

        while (scanner.hasNext()) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double balance = scanner.nextDouble();
            System.out.printf("  %d   |  %-10s |  $%.2f \n", id, name, balance);
        }   
        System.out.println("---------------------------------------");
        scanner.close();
    }
}