import java.util.Scanner;

public class DivisibleNumbers {
    
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        System.err.print("Ener a number: ");
        int num = number.nextInt();

        if ((num % 5 == 0) && (num % 11 == 0)) {

            System.out.println(num + " is divisible by 5 and 11.");

        } else {

            System.out.println(num + " is not divisible by 5 and 11.");
            
        }

    }
}
