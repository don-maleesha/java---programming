import java.util.Scanner;

public class FindCorrectCode {
    
    public static void main(String[] args) {
        
        Scanner code = new Scanner(System.in);

        System.out.print("Enter a code: ");
        int input = code.nextInt();

        int sampleCode = 1234;

        if (input == sampleCode) {
            System.out.println("Correct code. The door is open!");

        } else {
            System.out.println("Incorrect code!");

        }

    }
}
