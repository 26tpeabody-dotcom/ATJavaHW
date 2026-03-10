//Teagan Peabody 
//AT Java 
//Modeling a six-sided die

public class VirtualDie {
    private int value; // instance variable to represent the current value of the die
    private boolean isActive; // instance variable to indicate whether the die is active or has been quit

    // Default constructor
    public VirtualDie() {
        this.value = 1; 
        this.isActive = true; 
    }

    // Overloaded constructor
    public VirtualDie(int initialValue) {
        if (initialValue >= 1 && initialValue <= 6) {
            this.value = initialValue; 
        } else {
            this.value = 1; 
        }
        this.isActive = true; 
    }

    // Method to roll the die and generate a random value between 1 and 6
    public void roll() {
        if (isActive) {
            this.value = (int) (Math.random() * 6) + 1; 
        } else {
            System.out.println("Die has been quit. Please create a new die to roll.");
        }
    }

    // Method to get the current value of the die
    public int getValue() {
        return this.value;
    }

    // Method to quit using the die
    public void quit() {
        this.isActive = false; 
        System.out.println("Die has been quit. It can no longer be used.");
    }
}
