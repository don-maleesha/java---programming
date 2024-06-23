public class Point {

    // Private instance variables to store the coordinates of the point
    private int x;
    private int y;

    // Constructor that initializes the point's coordinates
    public Point(int startx, int starty) {
        x = startx;
        y = starty;
    }

    // Getter method for the x coordinate
    public int getx() {
        return x;
    }

    // Getter method for the y coordinate
    public int gety() {
        return y;
    }

    // Method to calculate the distance between this point and another point
    public double distance(Point otherPt) {
        // Calculate the difference in x coordinates
        int dx = x - otherPt.getx();
        // Calculate the difference in y coordinates
        int dy = y - otherPt.gety();
        // Calculate and return the Euclidean distance using the distance formula
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Main method to test the Point class
    public static void main(String[] args) {
        // Create a new Point object p1 with coordinates (3, 4)
        Point p1 = new Point(3, 4);
        // Create a new Point object p2 with coordinates (5, 12)
        Point p2 = new Point(5, 12);

        // Print the distance between p1 and p2
        System.out.println(p1.distance(p2));
    }
}
