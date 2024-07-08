import java.util.Scanner;

public class VarTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter a number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = num1 / num2;

        System.out.println(sum);
         System.out.println(sub);
          System.out.println(mul);
           System.out.println(div);


           
    }
}