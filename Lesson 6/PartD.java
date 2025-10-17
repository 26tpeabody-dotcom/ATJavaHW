//Teagan Peabody
//AT Java HW D
import java.util.Scanner;
public class PartD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cookies you want to purchase: ");
        int numCookies = scanner.nextInt();
        double pricePerCookie = 0.99;
        double totalCost = numCookies * pricePerCookie;
        double discount = 0.0;  
        if (numCookies > 24) {
            discount = 0.15;
        } else if (numCookies > 12) {
            discount = 0.05;
        } else if (numCookies > 6) {
            discount = 0.025;
        }
        double discountAmount = totalCost * discount;
        double finalCost = totalCost - discountAmount;
        System.out.printf("Total cost for %d cookies: $%.2f%n", numCookies, finalCost);
        scanner.close();
    }
}
 