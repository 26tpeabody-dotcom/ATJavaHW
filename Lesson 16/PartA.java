//Teagan Peabody
//AT Java
//Lesson 16 Part A

import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        String[] words = new String[MAX_SIZE];
        int currentSize = 0;

        currentSize = getWords(words, currentSize);
        System.out.println("Words/Phrases (current size = " + currentSize + "):");
        printWords(words, currentSize);

        cleanup(words, currentSize);
        System.out.println("Modified array...");
        System.out.println("Words/Phrases (current size = " + currentSize + "):");
        printWords(words, currentSize);
    }

    public static int getWords(String[] words, int currentSize) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a word or phrase or 'q' to quit: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            if (currentSize < words.length) {
                words[currentSize] = input;
                currentSize++;
            } else {
                System.out.println("Array is full. Cannot add more words.");
                break;
            }
        }
        return currentSize;
    }

    public static void printWords(String[] words, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            System.out.println("  " + words[i]);
        }
    }

    public static void cleanup(String[] words, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            if (words[i] != null) {
                words[i] = words[i].trim();
                if (!words[i].isEmpty()) {
                    words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
                }
            }
        }
    }
}