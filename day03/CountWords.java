import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        
        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sentence.nextLine();

        String[] words = input.split(" ");

        System.out.println("Number of words: " + words.length);

    }
}