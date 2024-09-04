class Cube extends Shape3D {
    private double sideLength;

    // Constructor to initialize the side length of the cube
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume() {
        // Volume of a cube: sideLength^3
        return Math.pow(sideLength, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        // Surface area of a cube: 6 * sideLength^2
        return 6 * Math.pow(sideLength, 2);
    }
}
