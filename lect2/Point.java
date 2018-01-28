/* Point class 

 */
import java.lang.Math;

class Point {
    public double x;
    public double y;

    // Create a 2D point with x and y coordinates
    public Point(double _x, double _y) {
        this.x = _x;
        this.y = _y;
    }

    // static method for measuring distance between 2 points
    public static double distance(Point p1, Point p2) {
        double diffX = p1.x - p2.x;
        double diffY = p1.y - p2.y;
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2)); 
    }
}
