// Import the Color library
import java.awt.Color;

/**.
* This is the balloon class for the Balloon Game
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-06
*/

// Define balloon class
public class Balloon {
    // Declare the balloon's x position
    int xPosition;

    // Declare the balloon's y position
    int yPosition;

    // Declare the balloon's colour
    Color color;

    // Declare is popped
    boolean isPopped;

    // Declare the balloon's id
    int id;

    /**
    * This is the constructor for the balloon class.
    *
    * @param xPos x position of the balloon
    * @param yPos y position of the balloon
    * @param color colour of the balloon
    * @param id id of the balloon
    */

    // Constructor for the balloon class
    public Balloon(final int xPos, final int yPos,
                 final Color color, final int id) {
        // Set the balloon's x position
        this.xPosition = xPos;

        // Set the balloon's y position
        this.yPosition = yPos;

        // Set the balloon's colour
        this.color = color;

        // Set the balloon's id
        this.id = id;

        // Set the balloon's isPopped to false
        this.isPopped = false;
    }

    /**
    * This is the method for moving the balloon.
    *
    * @param xSpaces x position of the balloon
    * @param ySpaces y position of the balloon
    */

    // Declare method to move the balloon
    public void moveBalloon(final int xSpaces, final int ySpaces) {
        // Move the balloon by the specified number of spaces
        this.xPosition += xSpaces;
        this.yPosition += ySpaces;
    }

    /**
    * This is the method for changing the balloons color.
    *
    * @param newColor the new color of the balloon
    */

    // Constructor for changing the balloon's colour
    public void changeColor(final Color newColor) {
        // Change the balloon's colour
        this.color = newColor;
    }
}
