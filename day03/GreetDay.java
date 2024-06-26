import java.util.Scanner;

public class GreetDay {
    
    public static void main(String[] args) {
        
        Scanner day = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        int input = day.nextInt();

        switch (input) {
            case 1:
                System.out.println("Happy Monday!");
                break;

            case 2:
                System.out.println("Happy Tuesday!");
                break;

            case 3:
                System.out.println("Happy Wednesday!");
                break;

            case 4:
                System.out.println("Happy Thursday!");
                break;

            case 5:
                System.out.println("Happy Friday!");
                break;

            case 6:
                System.out.println("Happy Saturday!");
                break;

            case 7:
                System.out.println("Happy Sunday!");
                break;

        }

    }

}
