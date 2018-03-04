class Hmm {
  public static void main(String[] args) {
    Shape[] shapes;
    Circle[] circles = new Circle[1];
    shapes = circles;
    //shapes[0] = new Square(3.0); // runtime error as array type diff

    /* 4(a)
     int i = 0;
     double d = 5.03933;
     //i = d; loss of precision
     //d = i;
     i = (int) d;
     d = (double) i;
     System.out.println(d + " aa " + i);
     */

    //4b : all incompatible type

    //I i1 = new I();
    //4c: b = (B)a; //narrowing during runtime error

    //4d: iterface cannot be instantiated.
    
    
  }
}

interface Shape {

}

class Circle implements Shape {

}

class Square implements Shape {
  public Square(double r) {

  }
}
