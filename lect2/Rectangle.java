//////
/////

/**
  * Rectangle object
  */

class Rectangle implements Shape, Printable {
    private Point leftEdge;
    private double length;
    private double height;

    public Rectangle(Point _left, double _length, double _height) {
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
