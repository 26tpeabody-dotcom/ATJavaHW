public class DemoApp {
    public static void main(String[] args) {
        int maxValue = 100;
        System.out.println("Here are 5 randomly generated numbers from 1 to 100:");
        for (int i = 0; i < 5; i++) {
            int value = Random.getRandomInteger(maxValue);
            System.out.println(value);
        }
        System.out.println("Goodbye!");
    }
}
