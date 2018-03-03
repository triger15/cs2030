class SolidCuboid extends Cuboid implements Solid3D {
    private double density = 1.0;

    public SolidCuboid(double length, double breadth, double height) {
        super(length, breadth,height);

    
    }

    public SolidCuboid(double density) {
        super(2,2,2);
        this.density = density;
    
    }

    public double getDensity() {
        return this.density;
    }

    public double getMass() {
        return this.density * getVolume();
    }

}
