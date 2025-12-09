//Teagan Peabody
//AT Java
//Calculate the volume of a sphere given its radius

import java.util.Scanner;
public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        
        double volume = calculateVolume(radius);
        System.out.printf("The volume of the sphere with radius %.2f is %.2f%n", radius, volume);
        
        scanner.close();
    }
    
    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

