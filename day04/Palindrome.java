import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner word = new Scanner(System.in);

        System.err.println("Enter a word: ");
        String input = word.nextLine();

        // Create a new string to store the reverse of the input string
        String reverse = "";

        // Loop through the input string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {

            // Append each character to the reverse string
            reverse += input.charAt(i);

        }

        // Check if the input string is a palindrome
        if (input.equals(reverse)) {

            System.out.println("The word is a palindrome.");

        } else {

            System.out.println("The word is not a palindrome.");
            
        }
    }
    
}
