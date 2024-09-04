import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();
        float c = input.nextFloat();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        float d = input.nextFloat();

        Calculator calculator = new Calculator(a, b, c, d);
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());

        System.out.println("Addition: " + calculator.add(c, d));
        System.out.println("Subtraction: " + calculator.subtract(c, d));
        System.out.println("Multiplication: " + calculator.multiply(c, d));
        System.out.println("Division: " + calculator.divide(c, d));


    }

}
