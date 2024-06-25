import java.util.Scanner;

public class GradeEvaluation {
    
    public static void main(String[] args) {
        
        Scanner grade = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int input = grade.nextInt();

        if (input >= 90) {

            System.out.println("A");

        } else if (input >= 80 && input < 90) {

            System.out.println("B");

        } else if (input >= 70 && input < 80) {

            System.out.println("C");

        } else if (input >= 60 && input < 70) {

            System.out.println("D");

        } else {

            System.out.println("F");

        }
    }
}
