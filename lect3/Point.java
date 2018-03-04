/* Point class 

 */
import java.lang.Math;

class Point {
    private double x;
    private double y;

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

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            System.out.println("this obj");
            return true;
        } else if (o instanceof Point) {
            // type cast
            Point pt = (Point) o;
            System.out.println("point equaLS");
            return (this.x == pt.x && this.y == pt.y);
        } else {
            return false;
        }
    }
}

//obj class
