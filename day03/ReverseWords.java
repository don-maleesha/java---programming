import java.util.Scanner;

public class ReverseWords {
    
    public static void main(String[] args) {
        
        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sentence.nextLine();

        String[] words = input.split(" ");

        for (int i = input.length() -1; i >= 0; i--) {

            System.out.print(words[i] + " ");

        }

    }

}
