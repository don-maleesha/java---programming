import java.util.Scanner;

public class IntIO {
    
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = number.nextInt();

        System.out.println("You entered: " + input);
    }
}
