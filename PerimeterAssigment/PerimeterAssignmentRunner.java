import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        
        int totalCount = 0; 
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            totalCount = totalCount + 1;
        }
        return totalCount;
    }

    public double getAverageLength(Shape s) {
        double length = getPerimeter(s);
        int totalcount = getNumPoints(s);
        double avgLength = length / totalcount;
        return avgLength;
    }

    public double getLargestSide(Shape s) {
        double totalPerim = 0.0;
        double largside = 0.0;
        double prevside = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            if (currDist > largside){
            largside = currDist; 
            }
            prevPt = currPt;
        }
        // totalPerim is the answer
        return largside;
    }

    public double getLargestX(Shape s) {
        double largestX = 0.0;
        double prevX = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            prevX = currPt.getX();
            if(prevX > largestX ){
            largestX = prevX;
            }
        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
           DirectoryResource dr = new DirectoryResource();
           double largestPerim = 0.0;
          for(File f : dr.selectedFiles()){
             FileResource file = new FileResource(f);
             Shape s = new Shape(file);
             double currprim = getPerimeter(s);
             if(currprim > largestPerim){
             largestPerim = currprim;
          }
       }
         return largestPerim;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;
        DirectoryResource dr = new DirectoryResource();
        double largestPerim = 0.0;
       for(File f : dr.selectedFiles()){
              System.out.println ("File Name : " +f);
             FileResource file = new FileResource(f);
             Shape s = new Shape(file);
             double currprim = getPerimeter(s);
             if(currprim > largestPerim){
             largestPerim = currprim;
             temp = f;
          }
       }
    
    return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("Perimeter = " + length);
        int totalcount = getNumPoints(s);
        System.out.println("Number of Points = " + totalcount);
        double avgLength = getAverageLength(s);
        System.out.println("Average of Length = " + avgLength);
        double largeside = getLargestSide(s);
        System.out.println("Longest Side = " + largeside);
        double largestX = getLargestX(s);
        System.out.println("Largest X = " + largestX);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        String LargPrimFile = getFileWithLargestPerimeter();
        System.out.println("Largest perimeter file = " + LargPrimFile );
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
