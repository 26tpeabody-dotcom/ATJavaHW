//Teagan Peabody
//AT Java
//Lesson 12 Part B

public class PartB {
    public static void main(String[] args) {
        double num1 = 5.4;
        double num2 = 3.2;
        double num3 = 4.8;

        double smallestNumber = smallest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallestNumber);
    }

    public static double smallest(double x, double y, double z) {
        if (x <= y && x <= z) {
            return x;
        } else if (y <= x && y <= z) {
            return y;
        } else {
            return z;
        }
    }
}
