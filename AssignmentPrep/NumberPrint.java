import java.util.Scanner;

public class NumberPrint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int i;

        for(i = 1; i <= n; i++){

            System.out.println(i);
            
        }

        for(i = n; i > 0; i--){

            System.out.println(i);

        }

        int j=1;
        do { 
            
            System.out.println(j);
            j++;

        } while (j <= n);

        input.close();
    }
}