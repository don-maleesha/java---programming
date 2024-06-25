import java.util.Scanner;

public class RemoveDuplicates {
    
    public static void main(String[] args){

        Scanner word = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = word.nextLine();

        // Initialize an empty string to store the result
        String result = " ";

        for (int i = 0; i < input.length(); i++) {

            // Check if the character at index i is not already in the result string
            if (result.indexOf(input.charAt(i)) < 0) {

                // If the character is not in the result string, add it to the result
                result += input.charAt(i);

            }
        }

        System.out.println("Modified String: " + result);

    }

}
