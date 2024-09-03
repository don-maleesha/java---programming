import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = Integer.parseInt(input.nextLine());

        while (testCases > 0) {
            String pattern = input.nextLine();

            try {
                //Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            
            // Decrement the testCases counter
            testCases--;
        }

        input.close(); // Close the scanner to prevent resource leaks
    }
}
