/* Circle class 

 */
import java.lang.Math;

/**
 * A Circle object encapsulates a circle on a 2D plane.  
 */
class Circle implements Shape, Printable {
    private Point cent;
    private double x;  // x-coordinate of the center
    private double y;  // y-coordinate of the center
    private double r;  // the length of the radius

    /**
     * create a circle centered on point object with given radius
     */
    public Circle(Point centre, double radius) {
        this.cent = centre;
        this.x = centre.x;
        this.y = centre.y;
        r = radius;
    }

    /**
     * Return the area of the circle.
     */
    @Override
        public double getArea()
        {
            return Math.PI*r*r;
        }

    /**
     * Return the circumference of the circle.

     public double getCircumference()
     {
     return Math.PI*2*r;
     }
     */

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
    @Override
        public boolean contains(Point _point)
        {
            double distance = Point.distance(this.cent, _point);
            if (distance <= r) {
                return true;
            } else {
                return false;
            }
        }

    @Override
        public double getPerimeter() {
            return Math.PI * 2 * r;
        }
    
    @Override
    public void print() {
        System.out.printf("radius : %f\n", r);
        System.out.printf("center:");
        
    }
}
