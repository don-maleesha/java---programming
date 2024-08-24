import java.util.Scanner;

public class ReverseWords {
    
    public static void main(String[] args) {
        
        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sentence.nextLine();

        String[] words = input.split(" "); // Split the input sentense into words using space as the delimiter


        // Loop through the words array in reverse order
        for (int i = input.length() -1; i >= 0; i--) {

            System.out.print(words[i] + " ");// Print each word followed by a space

        }

    }

}
