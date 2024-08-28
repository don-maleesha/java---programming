import java.util.Scanner;

public class CheckAlphabet {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an alphabet");
        }

        input.close();
    }
}