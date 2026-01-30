//Teagan Peabody
//AT Java
//Lesson 19 Part B

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("quizzes.txt");

        Scanner in = new Scanner(inputFile);

        PrintWriter out = new PrintWriter("quizzesMod.txt");

        double sum = 0;
        int count = 0;

        while (in.hasNextDouble()) {
            double score = in.nextDouble();
            sum += score;
            out.printf("Quiz %03d: %6.2f%n", count, score);
            count++;
        }

        double average = sum / count;

        out.println("----------------");
        out.printf("Average: %6.2f%n", average);

        in.close();
        out.close();
    }
}