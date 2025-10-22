//Teagan Peabody
//AT Java
//Part A lesson 7
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask if it's Monday
        System.out.print("Is it Monday? (yes/no): ");
        String isMondayInput = scanner.nextLine().trim().toLowerCase();
        boolean isMonday = isMondayInput.equals("yes");

        // Prompt for age
        System.out.print("Enter the age of the customer: ");
        int age = scanner.nextInt();

        // Prompt for cost of meal
        System.out.print("Enter the cost of the meal: ");
        double mealCost = scanner.nextDouble();

        double discount = 0.0;

        // Determine discount based on age and day
        if (isMonday) {
            if (age < 13) {
                discount = 0.075; // 7.5 percent
            } else if (age >= 50) {
                discount = 0.15; // 15 percent
            } else {
                discount = 0.05; // 5 percent
            }
        } else {
            if (age < 13) {
                discount = 0.05; // 5 percent
            } else if (age >= 50) {
                discount = 0.075; // 7.5 percent
            } else {
                discount = 0.05; // 5 percent
            }
        }

        // Calculate discounted cost
        double discountedCost = mealCost - (mealCost * discount);

        // Display the discounted cost
        System.out.printf("The discounted cost of the meal is: $%.2f%n", discountedCost);

        scanner.close();
    }
}
