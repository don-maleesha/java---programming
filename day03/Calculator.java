import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        Scanner operator = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = operator.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = operator.nextInt();

        System.out.print("Enter the operator: ");
        char op = operator.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            
            case '-':
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
                break;

            case '*':
                System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                break;

            case '/':
                if (num2 == 0) {

                    System.out.println("Error: Division by zero is not allowed.");

                }
                else {

                    System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));

                }

                break;

            default:
                System.out.println("Invalid operator");
                break;

        }

        
    }
}
