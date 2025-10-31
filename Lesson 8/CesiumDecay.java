//Teagan Peabody
//AT Java Homework
//Lesson 8
//Part A

public class CesiumDecay {
    public static void main(String[] args) {
        double initialAmount = 100.0;
        double currentAmount = initialAmount;
        int years = 0;

        while (currentAmount > initialAmount * 0.01) {
            currentAmount /= 2;
            years += 30;
        }

        System.out.println("Years required: " + years);
        System.out.println("Amount leftover: " + currentAmount + "%");
    }
}
