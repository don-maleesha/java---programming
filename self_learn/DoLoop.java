import java.util.Scanner;

public class DoLoop {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == 7) {

                System.out.println("That's lucky!");
    
            } else if (number == 13) {
    
                System.out.println("That's unlucky!");
                
            } else {
    
                System.out.println("That number is neither lucky nor unlucky.");
                
            }

        } 
        
        while (number != 0);

        input.close();

    }  

}
