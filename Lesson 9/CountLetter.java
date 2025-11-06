//Teagan Peabody
//AT Java
//Count Letter 

import java.util.Scanner;
public class CountLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("Number of times 'e' occurred: " + count);
        scanner.close();
    }
}
