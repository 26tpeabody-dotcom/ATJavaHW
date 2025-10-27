//Teagan Peabody
//AT Java HW B  
import java.util.Scanner;
public class ProjectB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter two floating-point numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble(); 
        if (Math.abs(num1 - num2) < 0.005) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
        scanner.close();
    }
}