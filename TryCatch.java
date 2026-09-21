import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double sphereDiam;
        double sphereRadius;
        double sphereVolume;

        try {
            System.out.print("Enter the diameter of a sphere: ");
            sphereDiam = keyboard.nextDouble();

            sphereRadius = sphereDiam / 2.0;
            sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);

            System.out.println("The volume is: " + sphereVolume);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        } finally {
            keyboard.close();
        }
    }
}

