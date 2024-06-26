public class Pattern {
    
    public static void main(String[] args){

        int i, j;

        // Outer for loop to control the number of rows
        for (i = 3; i < 9; i++) {
            
            // Inner for loop to control the number of stars in each row
            for (j = 1; j <= i; j++) {
                
                // Print a star without a new line
                System.out.print("*");
                
            }
            
            // Move to the next line after printing the stars in the current row
            System.out.println();
            
        }

    }

}
