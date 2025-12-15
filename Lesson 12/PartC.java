//Teagan Peabody
//AT Java   
//Lesson 12 Part C

public class PartC {
    public static void main(String[] args) {
        String testPhrase = "Hello Teagan!";
        int vowelCount = countVowels(testPhrase);
        System.out.println("The number of vowels in the phrase \"" + testPhrase + "\" is: " + vowelCount);
    }

    public static int countVowels(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char currentChar = phrase.charAt(i);
            if (isVowel(currentChar)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}


