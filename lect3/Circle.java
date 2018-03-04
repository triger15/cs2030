class Circle {
  private Point center;
  private double radius;

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    System.out.println("equals(Object) called overriden.");
    if (obj == this) {
      return true;
    }
    if (obj instanceof Circle) {
      Circle circle = (Circle) obj;
      return (circle.center.equals(center) && circle.radius == radius);
    } else {
      return false;
    }
  }

  public boolean equals(Circle circle) {
    System.out.println("equals(Circle) called");
    return (circle.center.equals(center) && circle.radius == radius);
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(new Point(0,0), 10);
    Circle c2 = new Circle(new Point(0,0), 10);
    Object o1 = c1;
    Object o2 = c2;

    o1.equals(o2);
    o1.equals((Circle)o2);
    o1.equals(c2);
    c1.equals(o2);
    c1.equals((Circle)o2);
    c1.equals(c2);
    
    /**
     * equals(Object) called overriden.
      point equaLS

      equals(Object) called overriden.
      point equaLS

      equals(Object) called overriden.
      point equaLS

      equals(Object) called overriden.
      point equaLS

      equals(Circle) called
      point equaLS

      equals(Circle) called
      point equaLS

     */
  }

  // 2) violates. togguleunderline method of LSV violated.
}