class Cuboid implements Shape3D {
    private double length;
    private double height;
    private double breadth;

    @Override
    public double getVolume() {
        return length*breadth*height;
    }

    Cuboid(double length, double height, double breadth) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;

        System.out.println("volume =" + getVolume());
    }
    

}
