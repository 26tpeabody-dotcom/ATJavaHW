public class PartA {
    public static void main(String[] args) {
        BaseballCard card1 = new BaseballCard("Babe Ruth", 1933);
        BaseballCard card2 = new BaseballCard("Babe Ruth", 1933);
        BaseballCard card3 = new BaseballCard("Lou Gehrig", 1933);

        System.out.println("card1: " + card1);
        System.out.println("card2: " + card2);
        System.out.println("card3: " + card3);

        System.out.println("card1.equals(card2): " + card1.equals(card2)); 
        System.out.println("card1.equals(card3): " + card1.equals(card3)); 
    }
}
