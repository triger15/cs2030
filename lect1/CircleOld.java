/* Circle class 

 */
import java.lang.Math;

/**
 * A Circle object encapsulates a circle on a 2D plane.  
 */
class Circle {
    private double x;  // x-coordinate of the center
    private double y;  // y-coordinate of the center
    private double r;  // the length of the radius

    /**
     * create a circle centered on (centerX, centerY) with given radius
     */
    public Circle(double centerX, double centerY, double radius) {
        x = centerX;
        y = centerY;
        r = radius;
    }

    /**
     * Return the area of the circle.
     */
    public double getArea()
    {
        return Math.PI*r*r;
    }

    /**
     * Return the circumference of the circle.
     */
    public double getCircumference()
    {
        return Math.PI*2*r;
    }

    /**
     * Move the center of the circle to the new position(newX, newY)
     */
    public void moveTo(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    /**
     * Return true if the given point(testX, testY) is within the circle.
     */
    public boolean contains(double testX, double testY)
    {
        return false;
        // TODO:
        // left
        // as
        // an
        // exercise  
    }
}
