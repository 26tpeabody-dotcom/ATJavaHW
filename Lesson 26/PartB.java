PartBs the output of the following program (and why)?

class Item {
    private int value;

    public void setValue(int value) {
        value = value;
    }

    public int getValue() {
        return value;
    }
}

public class PartB {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.println("Before: " + myItem.getValue());
        myItem.setValue(13);
        System.out.println("After: " + myItem.getValue());
    }
}
//The output of the program will be:
//Before: 0
//After: 0
//This the line 'value = value;' is assigning the parameter 'value' to itself, rather than assigning the parameter to the instance variable. To fix this, you can use the 'this' keyword to refer to the instance variable. The corrected setValue method would look like this:

public void setValue(int value) {
    this.value = value;
}
//By using 'this.value', we are referring to the instance variable, and assigning it the value of the parameter. This would be placed in the Item class, replacing the original setValue method.
//With this change, the output of the program will be:
//Before: 0
//After: 13 
