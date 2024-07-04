import java.util.Scanner;

public class FindTheMax {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int num1 = number.nextInt();

        System.out.print("Enter the number 2: ");
        int num2 = number.nextInt();

        System.out.print("Enter the number 3: ");
        int num3 = number.nextInt();

        if ((num1 > num2) &&  (num1 > num2)){

            System.out.println(num1);

        } else if ((num2 > num1) && (num2 > num3)) {

            System.out.println(num2);

        } else {
                
                System.out.println(num3);
                
        }

    }
    
}
