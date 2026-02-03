
import java.util.Scanner;
public class PartA {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        System.out.print("Enter the first integer to swap. 0 is the first integer you entered and 9 is the last ineteger you entered. (0-" + (numbers.length - 1) + "): ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the second integer to swap. 0 is the first integer you entered and 9 is the last ineteger you entered. (0-" + (numbers.length - 1) + "): ");
        int index2 = scanner.nextInt();


        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

        System.out.println("Modified array:");
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}