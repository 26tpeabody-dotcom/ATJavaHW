// Teagan and Will 
// Project Euler Problem 3
// Largest prime factor

import java.util.Scanner;
public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long largestFactor = 1;

        for (long i = 2; i <= number; i++) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        System.out.println("The largest prime factor is: " + largestFactor);
    }
}