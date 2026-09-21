import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculates sphere volume with input handling.
 *
 * @author Sarah Ouamou
 * @version 1.0
 * @since 2026-09-21
 */
public final class TryCatch {

    /**
     * Prevents instantiation of utility class.
     */
    private TryCatch() {
        // Private constructor for utility class
    }

    /**
     * Main entry point of the program.
     *
     * @param args Command-line arguments.
     */
    public static void main(final String[] args) {
        // Create a Scanner object to read input from the user
        Scanner keyboard = new Scanner(System.in);
        double sphereRadius; // Declare variable for sphere radius
        double sphereVolume; // Declare variable for sphere volume

        try {
            // Asks the user for input
            System.out.print("Enter the radius of a sphere: ");
            // Read input as a double
            sphereRadius = keyboard.nextDouble();

            // Check if input is negative or zero
            if (sphereRadius <= 0) {
                throw new IllegalArgumentException(
                    "Error: Radius cannot be negative or 0."
                );
            }

            // Calculate sphere volume
            sphereVolume = (4.0 / 3.0) * Math.PI
                * Math.pow(sphereRadius, 3);
            System.out.println("The volume is: " + sphereVolume);

        } catch (InputMismatchException e) {
            // Catch block to handle invalid non-numeric input
            System.out.println("Error: Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            // Catch block to handle negative number logic
            System.out.println(e.getMessage());
        } finally {
            // Close Scanner to prevent resource leaks
            keyboard.close();
        }
    }
}
