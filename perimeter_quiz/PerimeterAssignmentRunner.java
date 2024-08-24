import java.io.File;
import edu.duke.FileResource;
import edu.duke.DirectoryResource;

public class PerimeterAssignmentRunner {

    public double getPerimeter(Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;

        // Start with prevPt = the last point 
        Point prevPt = s.getLastPoint();

        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);

            // Update totalPerim by currDist
            totalPerim += currDist;

            // Update prevPt to be currPt
            prevPt = currPt;
        }

        // Return totalPerim
        return totalPerim;
    }

    public int getNumPoints(Shape s) {
        // Return the number of points in the shape
        return s.getPoints().size();
    }

    public double getAverageLength(Shape s) {
        // Calculate the average length of all sides
        double totalPerim = getPerimeter(s);
        int numPoints = getNumPoints(s);

        // Avoid division by zero
        if (numPoints == 0) {
            return 0.0;
        }

        return totalPerim / numPoints;
    }

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

    public double getLargestX(Shape s) {
        double largestX = Double.NEGATIVE_INFINITY;
        for (Point p : s.getPoints()) {
            if (p.getX() > largestX) {
                largestX = p.getX();
            }
        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        double largestPerimeter = 0.0;

        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double perimeter = getPerimeter(s);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
            }
        }

        return largestPerimeter;
    }

    public String getFileWithLargestPerimeter() {
        File largestFile = null;
        double largestPerimeter = 0.0;

        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double perimeter = getPerimeter(s);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
                largestFile = f;
            }
        }

        return (largestFile != null) ? largestFile.getName() : null;
    }

    public void testPerimeter() {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("Perimeter = " + length);

        int numPoints = getNumPoints(s);
        System.out.println("Number of points = " + numPoints);

        double avgLength = getAverageLength(s);
        System.out.println("Average length = " + avgLength);
    }

    public void testPerimeterMultipleFiles() {
        double largestPerimeter = getLargestPerimeterMultipleFiles();
        System.out.println("Largest perimeter = " + largestPerimeter);
    }

    public void testFileWithLargestPerimeter() {
        String fileName = getFileWithLargestPerimeter();
        System.out.println("File with largest perimeter = " + fileName);
    }

    public void triangle() {
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()) {
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("Perimeter = " + peri);
    }

    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
