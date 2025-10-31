//Teagan Peabody
//AT Java Homework
//Lesson 8
//Part B

import java.util.Scanner;
public class APR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the interest rate (APR)
        System.out.print("Enter the annual interest rate (APR) in percentage: ");
        double apr = scanner.nextDouble() / 100; // Convert percentage to decimal

        // Ask the user for the initial balance amount
        System.out.print("Enter the initial balance amount in dollars: ");
        double balance = scanner.nextDouble();

        //table should be printed with lines separating rows and columns
        System.out.println("---------------------------------------------------");
        System.out.printf("| Year | Interest Amount  |     Balance      |\n");
        System.out.println("---------------------------------------------------");  
        // Calculate and print the interest and balance for each year
        for (int year = 1; year <= 5; year++) {
            double interest = balance * apr;
            balance += interest;

            System.out.printf("| %-4d | $%-15.2f | $%-15.2f |\n", year, interest, balance);
        }
        System.out.println("---------------------------------------------------");
        scanner.close();
    }
}