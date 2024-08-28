import java.util.Scanner;
public class Calculator{
    public int add(int a ,int b){
        return a+b;
        }
        public double add(double a ,double b){
            return a+b;
        }
        public int subtraction(int a ,int b){
            return a-b;
        }
        public double subtraction(double a ,double b){
            return a-b;
        }
        public int multiplication(int a ,int b){
            return a*b;
        }
        public double multiplication(double a ,double b){
            return a*b;
        }
        public int division(int a ,int b){
            return a/b;
        }
        public double division(double a ,double b){
            return a/b;
        }
        
 public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);

    System.out.println("Enter the first number");
    int a=scn.nextInt();

    System.out.println("Enter the second number");
    int b=scn.nextInt();

    Calculator cal=new Calculator(); // creating object of class Calculator
    
    System.out.println("Addition of two numbers is "+cal.add(a,b));
    System.out.println("Subtraction of two numbers is "+cal.subtraction(a,b));
    System.out.println("Multiplication of two numbers is "+cal.multiplication(a,b));
    System.out.println("Division of two numbers is "+cal.division(a,b));
}


}