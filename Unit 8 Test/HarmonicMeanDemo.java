//Teagan Peabody
//AT Java
//Unit 8 Test

import org.derryfield.math.Alegebra;
import java.util.Scanner;

public class HarmonicMeanDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the second positive number: ");
        double y = scanner.nextDouble();
        scanner.close();
        //Example of good input: 4 and 6
        //Example of bad input: -4 and 6, or 4 and -6, or -4 and -6, or 0 and 0 

        double result = Alegebra.harmonicMean(x, y);
        System.out.println("Harmonic mean of " + x + " and " + y + " is: " + result);
    }
}
