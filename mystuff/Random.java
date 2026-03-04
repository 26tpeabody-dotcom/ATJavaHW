public class Random {
    public static int getRandomInteger(int maxValue) {
        if (maxValue < 1) {
            System.out.println("maxValue must be >= 1");
            return 1;
        }
        return (int) (Math.random() * maxValue) + 1;
    }
}
