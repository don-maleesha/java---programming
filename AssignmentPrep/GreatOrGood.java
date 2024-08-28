import java.util.Scanner;

public class GreatOrGood {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float a = input.nextFloat();

        System.out.print("Enter a number: ");
        float b = input.nextFloat();

        if ((a > b) && (a < 100)){

            System.out.println("Great");

        } else if ((a > b) || (a < 100)){

            System.out.println("Good");

        }

        if ( !(a == 20)){

            System.out.println("a is not equal to 20");

        }

        input.close();

    }

}