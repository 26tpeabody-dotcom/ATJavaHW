//Teagan Peabody
//AT Java
//Lesson 19 Part A

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("temps.txt");

        Scanner in = new Scanner(inputFile);

        ArrayList<Integer> temperatures = new ArrayList<>();

        int lowestTemp = Integer.MAX_VALUE;

        while (in.hasNextInt()) {
            int temp = in.nextInt();
            temperatures.add(temp);
            if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }

        for (int temp : temperatures) {
            if (temp == lowestTemp) {
                System.out.println(temp + " <= lowest");
            } else {
                System.out.println(temp);
            }
        }

        in.close();
    }
}
