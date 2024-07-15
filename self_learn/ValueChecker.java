import java.util.Scanner;

public class ValueChecker {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int number = input.nextInt();

        if (number == 7) {

            System.out.println("That's lucky!");

        } else if (number == 13) {

            System.out.println("That's unlucky!");
            
        } else {

            System.out.println("That number is neither lucky nor unlucky.");
            
        }

    }
    
}
