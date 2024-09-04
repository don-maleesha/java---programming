class Sphere extends Shape3D {
    private double radius;

    // Constructor to initialize the radius of the sphere
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        // Volume of a sphere: (4/3) * π * r^3
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        // Surface area of a sphere: 4 * π * r^2
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
