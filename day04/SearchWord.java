import java.util.Scanner;

public class SearchWord {
    
    public static void main(String[] args){

        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sentence.nextLine();

        System.out.print("Enter a word to search: ");
        String search = sentence.next();

        // Check if the input string contains the search word
        if (input.contains(search)) {

            System.out.println("The word is found in the sentence");

        } else {

            System.out.println("The word is not found in the sentence");

        }

    }
    
}
