public class ShapeMain {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(5); // Create a Sphere object with radius 5
        Shape3D cube = new Cube(3);     // Create a Cube object with side length 3

        // Calculate and display the volume and surface area of the sphere
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

        // Calculate and display the volume and surface area of the cube
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
    }
}
