import java.util.Scanner;

public class SumOfNaturalNos {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){

            sum += i;

        }

        System.out.println("Sum of natural numbers from 1 to " + n + " = " + sum);

        input.close();
    }
}