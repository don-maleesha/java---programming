import java.util.Scanner;

public class ToUpperCase {
    
    public static void main(String[] args) {
        
        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sentence.nextLine();

        //initialize a string to store the modified sentence
        String upperCase = " ";

        // Create another string to parse the input sentence into words
        Scanner words = new Scanner(input);

        // Process each word in the sentence
        while (words.hasNext()) {

            // Get the next word
            String word = words.next();

            // Convert the first character to uppercase and append the rest of the word
            upperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";

        }

        System.out.println("Modified sentence: " + upperCase);

    }

}
