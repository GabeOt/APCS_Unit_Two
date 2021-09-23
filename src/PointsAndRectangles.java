import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;

public class PointsAndRectangles
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the X coordinate of the top left corner of the rectangle?");
        int xCoord = scan.nextInt();
        System.out.println("What is the Y coordinate of the top left corner of the rectangle?");
        int yCoord = scan.nextInt();
        Point objectp = new Point(xCoord, yCoord);
        System.out.println("What is the length of the rectangle?");
        int length = scan.nextInt();
        System.out.println("What is the width of the rectangle?");
        int width = scan.nextInt();
        Dimension objectd = new Dimension(width, length);
        Rectangle objectr = new Rectangle(xCoord, yCoord, width, length);
        System.out.println(objectp);
        System.out.println(objectd);
        System.out.println(objectr);



        Scanner kb = new Scanner(System.in);
        // create print statements and get input for the x and y values.

        //Instantiate a Point object p. Hint: you will need the keyword "new"


        // create print statements and get input for the length and width

        //Instantiate a Dimension object d.

        //Instantiate a Rectangle object r.

        // Print each object p, d, and r on a separate line.
    }
}