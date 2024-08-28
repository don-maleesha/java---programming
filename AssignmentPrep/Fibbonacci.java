import java.util.Scanner;

public class Fibbonacci {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int prev = 0;
        int next = 1;

        for(int i = 1; i <= n; i++){

            System.out.print(prev + " ");
            int current = prev + next;
            prev = next;
            next = current;

        }
        
        input.close();
    }
}