//Teagan Peabody
//AT Java
//Part B lesson 7

import java.util.Scanner;
enum CustomerType { CHILD, ADULT, SENIOR }

public class PartB {
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

        // Determine customer type
        CustomerType customerType;
        if (age < 13) {
            customerType = CustomerType.CHILD;
        } else if (age >= 50) {
            customerType = CustomerType.SENIOR;
        } else {
            customerType = CustomerType.ADULT;
        }

        // Determine discount based on customer type and day
        if (isMonday) {
            switch (customerType) {
                case CHILD:
                    discount = 0.075; // 7.5 percent
                    break;
                case SENIOR:
                    discount = 0.15; // 15 percent
                    break;
                case ADULT:
                    discount = 0.05; // 5 percent
                    break;
            }
        } else {
            switch (customerType) {
                case CHILD:
                    discount = 0.05; // 5 percent
                    break;
                case SENIOR:
                    discount = 0.075; // 7.5 percent
                    break;
                case ADULT:
                    discount = 0.05; // 5 percent
                    break;
            }
        }

        // Calculate discounted cost
        double discountedCost = mealCost - (mealCost * discount);

        // Display the discounted cost
        System.out.printf("The discounted cost of the meal is: $%.2f%n", discountedCost);

        scanner.close();
    }
}

}