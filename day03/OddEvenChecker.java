import java.util.Scanner;

public class OddEvenChecker {

    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = number.nextInt();

        if (input % 2 == 0) {

            System.out.println("Even number!");


        } else {
            
            System.out.println("Odd number!");

        }

    }
    
}
