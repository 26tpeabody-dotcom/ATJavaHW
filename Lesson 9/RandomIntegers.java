//Teagan Peabody
//AT Java
//Random Integers Average

import java.util.Scanner;
public class RandomIntegers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 10; // Change this to 1000 for the second part

        for (int i = 0; i < count; i++) {
            int randomInt = (int) (Math.random() * 10) + 1;
            sum += randomInt;
        }

        double average = (double) sum / count;
        System.out.println("Average of " + count + " random integers: " + average);
    }
}

//Yes, the average value makes sense. Since the random integers are generated between 1 and 10, the expected average should be around the midpoint of this range, which is 5.