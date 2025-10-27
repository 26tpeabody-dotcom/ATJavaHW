//Teagan Peabody
//AT Java HW C
import java.util.Scanner;
public class ATprobproject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three strings: ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();   
        String first, second, third;
        if (str1.compareTo(str2) <= 0 && str1.compareTo(str3) <= 0) {
            first = str1;
            if (str2.compareTo(str3) <= 0) {
                second = str2;
                third = str3;
            } else {
                second = str3;
                third = str2;
            }
        } else if (str2.compareTo(str1) <= 0 && str2.compareTo(str3) <= 0) {
            first = str2;
            if (str1.compareTo(str3) <= 0) {
                second = str1;
                third = str3;
            } else {
                second = str3;
                third = str1;
            }
        } else {
            first = str3;
            if (str1.compareTo(str2) <= 0) {
                second = str1;
                third = str2;
            } else {
                second = str2;
                third = str1;
            }
        }
        System.out.println("Sorted order: " + first + " " + second + " " + third);
        scanner.close();
    }
}