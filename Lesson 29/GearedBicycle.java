public class GearedBicycle extends Bicycle {
    private int currentGear = 1; // current gear of the bicycle
    private final int MAX_GEAR = 6; // maximum gear
    private final int GEARED_MAX_SPEED = 50;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int newGear) {
        if (newGear >= 1 && newGear <= MAX_GEAR) {
            currentGear = newGear;
        } else {
            System.out.println("Invalid gear. Please set a gear between 1 and " + MAX_GEAR);
        }
    }

    public void shiftUp() {
        if (currentGear < MAX_GEAR) {
            currentGear++;
        } else {
            System.out.println("Already in the highest gear.");
        }
    }

    public void shiftDown() {
        if (currentGear > 1) {
            currentGear--;
        } else {
            System.out.println("Already in the lowest gear.");
        }
    }

    public void pedal() {
        int newSpeed = getSpeed() + getCurrentGear();
        if (newSpeed > GEARED_MAX_SPEED) {
            newSpeed = GEARED_MAX_SPEED;
        }
        setSpeed(newSpeed);
    }

    public void brake() {
        int newSpeed = getSpeed() - 2;
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        setSpeed(newSpeed);
    }
}
