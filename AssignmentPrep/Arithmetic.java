import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        System.out.print("Enter a number: ");
        int b = input.nextInt();

        System.out.print("Enter a number: ");
        int c = input.nextInt();

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * c;
        int divition = a / b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtracton: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Divition: " + divition);

        int modulas = a % c;
        System.out.println("Modulas: " + modulas);

    }
}