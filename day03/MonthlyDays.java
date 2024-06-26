

import java.util.Scanner;


public class MonthlyDays {
    
    public static void main(String[] args) {
        
        Scanner month = new Scanner(System.in);

        System.out.print("Enter the month number (1 - 12): ");
        int input = month.nextInt();

        switch (input) {
            
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            case 2:
                System.out.println("28 or 29 days");
                break;

            default:
                System.out.println("Invalid month number");
                break;  

        }
    }
}
