import java.util.*;

public class JavaStaticInitializerBlock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        
        int breadth = input.nextInt();
        int height = input.nextInt();
        
        int area = (breadth * height);
        
        if ((breadth > 0) && (height > 0)) {
            
            System.out.println(area);
            
        } else {
            
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            
        }
        
        
        
    }
}