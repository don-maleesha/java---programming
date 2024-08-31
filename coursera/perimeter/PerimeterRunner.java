import edu.duke.*;
import java.io.File;

public class PerimeterRunner {

    // Calculate the perimeter of a shape
    public double getPerimeter(Shape s) {
        double totalPerim = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            totalPerim += currDist;
            prevPt = currPt;
        }
        return totalPerim;
    }

    // Get the number of points in the shape
    public int getNumPoints(Shape s) {
        int numPoints = 0;
        for (Point p : s.getPoints()) {
            numPoints++;
        }
        return numPoints;
    }

    // Calculate the average side length of the shape
    public double getAverageLength(Shape s) {
        double totalPerim = getPerimeter(s);
        int numSides = getNumPoints(s);
        return numSides > 0 ? totalPerim / numSides : 0.0;
    }

    // Find the largest side length of the shape
    public double getLargestSide(Shape s) {
        double largestSide = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            if (currDist > largestSide) {
                largestSide = currDist;
            }
            prevPt = currPt;
        }
        return largestSide;
    }

    // Find the largest x-coordinate of the shape
    public double getLargestX(Shape s) {
        double largestX = Double.NEGATIVE_INFINITY;
        for (Point p : s.getPoints()) {
            double x = p.getX();
            if (x > largestX) {
                largestX = x;
            }
        }
        return largestX;
    }

    // Get the largest perimeter from multiple files
    public double getLargestPerimeterMultipleFiles() {
        DirectoryResource dr = new DirectoryResource();
        double largestPerimeter = 0.0;

        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr); // Ensure Shape is properly initialized
            double perimeter = getPerimeter(s);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
            }
        }

        return largestPerimeter;
    }

    // Get the file with the largest perimeter
    public String getFileWithLargestPerimeter() {
        DirectoryResource dr = new DirectoryResource();
        File fileWithLargestPerimeter = null;
        double largestPerimeter = 0.0;

        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr); // Ensure Shape is properly initialized
            double perimeter = getPerimeter(s);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
                fileWithLargestPerimeter = f;
            }
        }

        return fileWithLargestPerimeter != null ? fileWithLargestPerimeter.getName() : "No file found";
    }

    // Test all methods
    public void testPerimeter() {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int numPoints = getNumPoints(s);
        double averageLength = getAverageLength(s);
        double largestSide = getLargestSide(s);
        double largestX = getLargestX(s);
        double largestPerimeter = getLargestPerimeterMultipleFiles();
        String fileName = getFileWithLargestPerimeter();
        
        System.out.println("Perimeter = " + length);
        System.out.println("Number of points = " + numPoints);
        System.out.println("Average length = " + averageLength);
        System.out.println("Largest side = " + largestSide);
        System.out.println("Largest X value = " + largestX);
        System.out.println("The largest perimeter is: " + largestPerimeter);
        System.out.println("The file with the largest perimeter is: " + fileName);
    }

    public static void main(String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
