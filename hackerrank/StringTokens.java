import java.util.*;

public class StringTokens {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the input sentence
        String sentence = input.nextLine();

        // Split the sentence into tokens based on non-alphabetic characters
        String[] words = sentence.split("[^A-Za-z]+");

        // Remove any empty tokens that may result from leading or trailing delimiters
        List<String> tokens = new ArrayList<>(); // what is this line doing? 
        for (String word : words) {
            if (!word.isEmpty()) {
                tokens.add(word);
            }
        }

        // Print the number of tokens
        System.out.println(tokens.size());

        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }

        input.close();
    }
}
