//Teagan Peabody 
//AT Java
//Lesson 12 Part A

//Here is the code given in the prompt with the error:
public class Conversation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String input = in.next();
        System.out.println("Hello, " + input);
        System.out.print("How old are you? ");
        int input = in.nextInt();
        input++;
        System.out.println("Next year, you will be " + input);
    }
}
// The error in the program is that the variable 'input' is declared twice with different types (String and int). This causes a compilation error because a variable cannot be redeclared in the same scope.
// To fix this, we can use different variable names for the two inputs. For example, we can rename the second 'input' variable to 'age'. Here is the corrected code:
import java.util.Scanner; 

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String name = in.next();
        System.out.println("Hello, " + name);
        System.out.print("How old are you? ");
        int age = in.nextInt();
        age++;
        System.out.println("Next year, you will be " + age);
    }
} 
