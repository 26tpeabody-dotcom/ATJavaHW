//Teagan Peabody
//AT Java
//Mini programming project

import java.util.Scanner;
public class Rollingdice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int die1, die2; 
        do {
            die1 = (int)(Math.random() * 6) + 1; 
            die2 = (int)(Math.random() * 6) + 1; 
            System.out.println("Die 1: " + die1 + ", Die 2: " + die2);
        } while (die1 != die2);
        System.out.println("Both dice have the same number. Stopping the simulation.");
        scanner.close();
        System.out.println("Final Dice:");
        if (die1 == 1) {
                System.out.println("-----    -----");
                System.out.println("|   |    |   |");
                System.out.println("| o |    | o |");
                System.out.println("|   |    |   |");
                System.out.println("-----    -----");
            
            } else if (die1 == 2) {
                System.out.println("-----    -----");
                System.out.println("|o  |    |o  |");
                System.out.println("|   |    |   |");
                System.out.println("|  o|    |  o|");
                System.out.println("-----    -----");
        
            } else if (die1 == 3) {
                System.out.println("-----    -----");
                System.out.println("|o  |    |o  |");
                System.out.println("| o |    | o |");
                System.out.println("|  o|    |  o|");
                System.out.println("-----    -----");
            } else if (die1 == 4) {
                System.out.println("-----    -----");
                System.out.println("|o o|    |o o|");
                System.out.println("|   |    |   |");
                System.out.println("|o o|    |o o|");
                System.out.println("-----    -----");
            } else if (die1 == 5) {
                System.out.println("-----    -----");
                System.out.println("|o o|    |o o|");
                System.out.println("| o |    | o |");
                System.out.println("|o o|    |o o|");
                System.out.println("-----    -----");
            } else if (die1 == 6) {
                System.out.println("-----    -----");
                System.out.println("|o o|    |o o|");
                System.out.println("|o o|    |o o|");
                System.out.println("|o o|    |o o|");
                System.out.println("-----    -----");
        }
    }
}