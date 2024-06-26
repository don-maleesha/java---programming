import java.util.Scanner;

public class PascalTriangle {
    
    public static void main(String[] args) {
        
        int rows;

        Scanner no = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        rows = no.nextInt();
        
        for(int i = 0; i < rows; i++) {
            
            int number = 1;
            
            // Inner for loop to control the number of spaces in each row
            for(int j = 0; j < rows - i; j++) {
                
                System.out.print(" ");
                
            }
            
            // Inner for loop to control the number of stars in each row
            for(int k = 0; k <= i; k++) {
                
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
                
            }
            
            System.out.println();
            
        }
    }
}
