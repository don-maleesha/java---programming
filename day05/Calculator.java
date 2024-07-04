import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        boolean exit = false;

        System.out.println("-----------------");
        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        while (!exit) {
            
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num4 = scanner.nextInt();
                    int difference = num3 - num4;
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    int num5 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num6 = scanner.nextInt();
                    int product = num5 * num6;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    int num7 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num8 = scanner.nextInt();
                    if (num8 != 0) {
                        double quotient = (double) num7 / num8;
                        System.out.println("Result: " + quotient);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the first number: ");
                    int num9 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num10 = scanner.nextInt();
                    int remainder = num9 % num10;
                    System.out.println("Result: " + remainder);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println();
        }

        scanner.close();
    }
}
