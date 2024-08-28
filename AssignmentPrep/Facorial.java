import java.util.Scanner;

public class Facorial {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        
        int factorial = 1;

        for(int i = 1; i <= n; i++){

            factorial = factorial * i;

        }

        System.out.println("Factorial of " + n + " = " + factorial);
        
        input.close();

    }

}