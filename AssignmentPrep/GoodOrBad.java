import java.util.Scanner;

public class GoodOrBad {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        float number = input.nextFloat();

        if (number > 10) {

            System.out.println("Good");

        } else {

            System.out.println("Bad");
        }

        input.close();

    }
    
}