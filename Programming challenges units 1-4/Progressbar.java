//Teagan Peabody
//AT Java
//Mini programming project

import java.util.Scanner;
public class Progressbar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value from 0 to 20: ");
        int value = scanner.nextInt();
        if (value < 0 || value > 20) {
            System.out.println("Please enter a valid integer between 0 and 20.");
        } else {
            int percentage = (value * 100) / 20;
            System.out.print("Progress: [");
            for (int i = 0; i < value; i++) {
                System.out.print("#");
            }
            for (int i = value; i < 20; i++) {
                System.out.print("-");
            }
            System.out.println("] " + percentage + "%");
        }
        scanner.close();
    }
}   