public class Work {
   //void = returns nothing 
   //thing after public static is what you will return 
   //thing in parentheses is what you will take in
   //body is what you will do
   
    public static void echo (String phrase) {
        System.out.println(phrase);
    }
    
    public static double squared (double number) {
        double value = number * number;
        return value;
    }
    
    public static void main (String[] args) {
        echo("Vacation...");
    }
}
