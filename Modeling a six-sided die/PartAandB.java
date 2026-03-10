//Teagan Peabody
//AT Java
//Modeling a six-sided die 

//Part A:
// The virtual die will have the following methods:
   //method 1: roll() - this method will use Math.random() to generate a random number between 1 and 6, simulating the rolling of a die. It will return the value of the die after the roll.

    //method 2: getValue() - this method will return the current value of the die. This allows external objects to check the value of the die without rolling it.

    //method 3: quit() - this method will allow external objects to signal that they are done interacting with the die. It could be used to perform any necessary cleanup or to indicate that the die should no longer be used.

// Part B:
// The data model for the virtual die will consist of a single instance variable, which will be an integer to represent the current value of the die. This variable will be updated each time the roll() method is called, and it will be accessed by the getValue() method to return the current state of the die. Additionally, we may have a boolean variable to indicate whether the die is active or has been quit, which can be used in the quit() method to manage the state of the die.




