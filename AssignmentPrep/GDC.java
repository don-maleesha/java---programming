import java.util.Scanner;

public class GDC {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        System.out.print("Enter another number: ");
        int m = input.nextInt();

        int gcd = 1;

        for(int i = 1; i <= n && i <= m; i++){

            if(n % i == 0 && m % i == 0){
                gcd = i;
            }

        }

        System.out.println("GDC of " + n + " and " + m + " = " + gcd);
        
        input.close();
    }
}