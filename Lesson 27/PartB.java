import java.util.Scanner;

import org.derryfield.math.Geometry;

public class PartB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of a square's side: ");
		double side = scanner.nextDouble();

		double perimeter = Geometry.getPerimeterOfSquare(side);
		double area = Geometry.getAreaOfSquare(side);

		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);

		scanner.close();
	}
}

