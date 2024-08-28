import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" "); // split(" ") uses space as a delimiter

        for (int i = words.length - 1; i >= 0; i--) {

            System.out.print(words[i] + " ");
            
        }
    }
}