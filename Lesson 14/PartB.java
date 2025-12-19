//Teagan Peabody
//AT Java
//Lesson 14 Part B 

public class PartB {
    public static void main(String[] args) {
        double[] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 }; 
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) { 
            double num = numbers[i]; 
            System.out.println(num);
            sum += num;
        }

        double average = sum / numbers.length;
        System.out.println("Avg = " + average);
    }
}

