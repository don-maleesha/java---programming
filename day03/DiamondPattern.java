import java.util.Scanner;

public class DiamondPattern {
    
    public static void main(String[] args) {
        
        int i, j, k;

        Scanner number = new Scanner(System.in);

        System.out.print("Enter the Width of the diamond (must be an odd number): ");
        int input = number.nextInt();

        // Check if the input is an odd number
        if (input % 2 == 0) {

            System.out.println("The number is not odd. Please enter an odd number.");
            return;
            
        }

        // Upper half of the diamond
        for (i = 1; i <= input; i += 2) {

            for (j = input; j > i; j -= 2) {
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
        // Lower half of the diamond
        for (i = input - 2; i >= 1; i -= 2) {

            for (j = input; j > i; j -= 2) {
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}
