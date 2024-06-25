import java.util.Scanner;

public class VoteEligible {
    
    public static void main(String[] args) {
        
        Scanner age = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int input = age.nextInt();

        if (input >= 18) {

            System.out.println("You are eligible to vote!");

        } else {
            
            System.out.println("You are not eligible to vote!");

        }

    }
    
}