//Teagan Peabody
//AT Java
//AT Problem lesson 7

import java.util.Scanner;
public class ATprob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for a number between 1 and 3999
        System.out.print("Enter a number between 1 and 3999: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 1 || number > 3999) {
            System.out.println("Invalid input. Please enter a number between 1 and 3999.");
        } else {
            String romanNumeral = "";

            // Thousands place
            if (number >= 1000) {
                int thousands = number / 1000;
                if (thousands == 1) {
                    romanNumeral += "M";
                } else if (thousands == 2) {
                    romanNumeral += "MM";
                } else if (thousands == 3) {
                    romanNumeral += "MMM";
                }
                number %= 1000;
            }

            // Hundreds place
            if (number >= 100) {
                int hundreds = number / 100;
                if (hundreds == 1) {
                    romanNumeral += "C";
                } else if (hundreds == 2) {
                    romanNumeral += "CC";
                } else if (hundreds == 3) {
                    romanNumeral += "CCC";
                } else if (hundreds == 4) {
                    romanNumeral += "CD";
                } else if (hundreds == 5) {
                    romanNumeral += "D";
                } else if (hundreds == 6) {
                    romanNumeral += "DC";
                } else if (hundreds == 7) {
                    romanNumeral += "DCC";
                } else if (hundreds == 8) {
                    romanNumeral += "DCCC";
                } else if (hundreds == 9) {
                    romanNumeral += "CM";
                }
                number %= 100;
            }

            // Tens place
            if (number >= 10) {
                int tens = number / 10;
                if (tens == 1) {
                    romanNumeral += "X";
                } else if (tens == 2) {
                    romanNumeral += "XX";
                } else if (tens == 3) {
                    romanNumeral += "XXX";
                } else if (tens == 4) {
                    romanNumeral += "XL";
                } else if (tens == 5) {
                    romanNumeral += "L";
                } else if (tens == 6) {
                    romanNumeral += "LX";
                } else if (tens == 7) {         
                    romanNumeral += "LXX";
                } else if (tens == 8) {
                    romanNumeral += "LXXX";
                } else if (tens == 9) {
                    romanNumeral += "XC";
                }
                number %= 10;
            }   
            // Units place
            if (number >= 1) {
                int units = number;         
                if (units == 1) {
                    romanNumeral += "I";
                } else if (units == 2) {
                    romanNumeral += "II";
                } else if (units == 3) {
                    romanNumeral += "III";
                } else if (units == 4) {
                    romanNumeral += "IV";
                } else if (units == 5) {
                    romanNumeral += "V";
                } else if (units == 6) {
                    romanNumeral += "VI";
                } else if (units == 7) {
                    romanNumeral += "VII";
                } else if (units == 8) {
                    romanNumeral += "VIII";
                } else if (units == 9) {
                    romanNumeral += "IX";
                }
            }
            // Display the Roman numeral
            System.out.println("The Roman numeral is: " + romanNumeral);
        }
        scanner.close();
    }
}
