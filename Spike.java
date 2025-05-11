/**.
* This is the spike class for the Balloon Game
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-06
*/

// Define the spike class
public class Spike {
    // Declare x position
    int xPosition;

    /** .
     * yPosition is the y-position of the spike.
     */

    // Declare y position
    public static final int yPosition = 0;

    /**
    * This is the constructor for the spike.
    *
    * @param xPos x position of the spike
    */

    // Create constructor for the spike
    public Spike(final int xPos) {
        // Set the spike's x position
        this.xPosition = xPos;
    }

    /**
    * This is the method for popping the balloon.
    *
    * @param balloon the balloon object
    */

    // Create constructor for balloon popping
    public void popBalloon(final Balloon balloon) {
        // Check if the balloon is not popped
        if (!balloon.isPopped) {
            // Set the balloon's isPopped to true
            balloon.isPopped = true;
        }
    }

    /**
    * This is the method for moving the spike.
    *
    * @param spaces x position of the spike
    */

    // Declare constructor for moving the spike
    public void moveSpike(final int spaces) {
        // Move the spike by a certain number of spaces
        this.xPosition += spaces;
    }
}
