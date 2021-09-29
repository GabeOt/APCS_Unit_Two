import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the x coordinate?");
        int coordX = scan.nextInt();
        System.out.println("What is the y coordinate?");
        int coordY = scan.nextInt();
        System.out.println("What is the width?");
        int width = scan.nextInt();
        System.out.println("What is the height?");
        int height = scan.nextInt();
        Rectangle rectangle1 = new Rectangle(coordX,coordY,width,height);
        int width2 = (int) (rectangle1.getWidth());
        int height2 = (int) (rectangle1.getHeight());
        int perimeter = width2*2 + height2*2;
        System.out.println("Perimeter = " + perimeter);
        rectangle1.setLocation(coordX-4, coordY+2);
        System.out.println("New location is (" + rectangle1.getX() + ", " + rectangle1.getY() + ")");








        // Get input for x, y, width, and height. Create four separate variables for these.


        // Create a Rectangle object using the four pieces of user input.


        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it

        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.

    }
}
