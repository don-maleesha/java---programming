import java.util.Scanner;

public class IntegerComparison {
    
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input1 = number.nextInt();

        System.out.print("Enter another number: ");
        int input2 = number.nextInt();

        if (input1 > input2) {

            System.out.println("The larger number is " + input1);

        } else if (input1 < input2) {
            
            System.out.println("The larger number is " + input2);

        }  else {
            
            System.out.println("Both numbers are equal!");

        }
        
    }
}
