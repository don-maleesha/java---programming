import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Do you hold a current driving licence? ");
        char drivingLicence = input.next().charAt(0);

        if ((age >= 21) && (drivingLicence == 'y')) {

            System.out.println("You are an adult and can hire a car.");

        } else {

            System.out.println("You are not an adult so cannot hire a car.");
        
        }

        input.close(); // Close the Scanner object
        
    }
    
}
