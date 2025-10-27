//Teagan Peabody
//AT Java
//AT Problem lesson 7
 
import java.util.Scanner;
public class ATprob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (1-3999): ");
        int number = scanner.nextInt();
        if (number < 1 || number > 3999) {
            System.out.println("Invalid input. Please enter a number between 1 and 3999.");
        } else {
            String romanNumeral = convertToRoman(number);
            System.out.println("Roman numeral: " + romanNumeral);
        }
    }
    public static String convertToRoman(int number) {
        String[] thousands = { "", "M", "MM", "MMM" };
        String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String roman = "";
        roman += thousands[number / 1000];
        roman += hundreds[(number % 1000) / 100];
        roman += tens[(number % 100) / 10];
        roman += ones[number % 10];
        return roman;
    }
}