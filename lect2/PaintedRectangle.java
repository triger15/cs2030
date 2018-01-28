/**
 * PaintedRectangle
 */
import java.awt.Color;

public class PaintedRectangle extends PaintedShape implements Shape,Printable {
    private Point leftEdge;
    private double length;
    private double height;

    // default
    public PaintedRectangle(Point _left, double _length, double _height) {
        super(Color.WHITE, Color.BLACK, 1.0);
        this.leftEdge = _left;
        this.length = _length;
        this.height = _height;
    }

    // overloading
    public PaintedRectangle(Point _left, double _length, double _height, Color fillColor, Color borderColor) {
        super(fillColor, borderColor, 1.0);
        this.leftEdge = _left;
        this.length = _length;
        this.height = _height;
    }

    @Override
    public double getArea() {
        return length * height;
    }
    
    @Override
    public double getPerimeter() {
        return length * 2 + height * 2;    
    }

    @Override
    public boolean contains(Point p) {
        //
        return false;
    }

    @Override
    public void print() {
        System.out.println("area :" + this.getArea() + " peri :" + this.getPerimeter() + " where: " + this.leftEdge);
    }
    
}