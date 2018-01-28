/*
Main course
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Circle c = new Circle(new Point(0,0), 10);
        Shape c1 = c;
        Printable c2 = c;
    //        c1.print(); // does not implement print
        c2.print();
        c1.getArea();
        // c2.getArea(); interface type does not implement this


        Rectangle r = new Rectangle(new Point(0,0), 5, 3.22);
        r.print();
    }

}
