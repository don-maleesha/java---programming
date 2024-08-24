
import java.util.Scanner;

public class PyramidPattern {
    
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        System.out.print("Enter the hight of the pyramid: ");
        int input = number.nextInt();

        for(int i = 1; i <= input; i++) {

            // Inner for loop to control the number of spaces in each row
            for(int j = 1; j <= input - i; j++) {

                System.out.print(" ");

            }

            // Inner for loop to control the number of stars in each row
            for(int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
