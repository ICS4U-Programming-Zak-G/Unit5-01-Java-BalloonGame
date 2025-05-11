// Import libraries
import java.awt.*;

/**.
* This is the main class for the Balloon Game
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-06
*/

// Define the main class
public class Main {
    // Declare the main method
    public static void main(final String[] args) {
        // Create a new instance of the balloon
        Balloon balloonA = new Balloon(75, 49, Color.BLUE, 1);

        // Create a new instance of the spike
        Spike spike = new Spike(50);

        // Print initial positions of balloon A
        System.out.println("Balloon A's initial position: "
            + balloonA.xPosition + ", " + balloonA.yPosition);

        // Move ballon A
        balloonA.moveBalloon(5, 10);

        // Print new positions of balloon A
        System.out.println("Balloon A's new position: "
            + balloonA.xPosition + ", " + balloonA.yPosition);

        // Print colour of balloon A
        System.out.println("Balloon A's colour is: " + balloonA.color);

        // Change the colour of balloon A
        balloonA.changeColor(Color.RED);

        // Print new colour of balloon A
        System.out.println("Balloon A's new colour is: " + balloonA.color);

        // Print spikes initial position
        System.out.println("Spike's initial position: " + spike.xPosition);

        // Move the spike to the ballon x position
        spike.moveSpike(balloonA.xPosition - spike.xPosition);

        // Print new position of the spike
        System.out.println("Spike's new position: " + spike.xPosition);

        // Pop the balloon
        spike.popBalloon(balloonA);

        // Print if the balloon A is popped
        if (balloonA.isPopped) {
            System.out.println("Balloon A is popped!");

        // Otherwise balloon A is not popped
        } else {
            System.out.println("Balloon A is not popped.");
        }
    }
}
