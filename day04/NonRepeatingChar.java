// Import the Scanner class for user input
import java.util.Scanner;

public class NonRepeatingChar {

    public static void main(String[] args) {
        
        
        Scanner word = new Scanner(System.in);

        
        System.out.print("Enter a word: ");
        
        String input = word.nextLine();

        // Loop through the input string to check for repeating characters
        for(int i = 0; i < input.length(); i++) {

            // Get the current character at index i
            char currentChar = input.charAt(i);

            // Initialize a flag to check if the character is repeating
            boolean isRepeating = false;

            // Loop through the input string again to compare characters
            for(int j = 0; j < input.length(); j++) {

                // Check if currentChar is found at another position in the string
                if(i != j && currentChar == input.charAt(j)) {

                    // Set the flag to true if a repeat is found
                    isRepeating = true;
                    
                    // Exit the inner loop since we found a repeating character
                    break;

                }

            }

            // If the character is not repeating, print it and exit the loop
            if(!isRepeating) {

                System.out.println("The first non-repeating character is: " + currentChar);
                break;
                
            }
        }
    }

}
