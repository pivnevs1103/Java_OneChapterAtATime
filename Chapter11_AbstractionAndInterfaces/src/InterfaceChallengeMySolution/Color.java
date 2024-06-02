package InterfaceChallengeMySolution;

import java.util.ArrayList;

public enum Color {

    RED,
    BLUE,
    GREEN,
    BLACK;

    // Creating the static variable that makes sure that every color is used in an order
    private static int counter = -1;

    public Color choosingColor(){

        // Creating an array of type Color[]
        var array = Color.values();
        //
        counter++;

        // Once the counter reaches 4, it means that the black color was used, which means that all colors have been
        // used up, and this resets the counter back to 0(first color - RED)
        if(counter == 4){
            counter = 0;
        }

        // Returns the enum type/Color based on the counter value
        return array[counter];
    }
}
