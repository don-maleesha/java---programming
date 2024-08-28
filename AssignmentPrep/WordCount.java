import java.util.Scanner;

public class WordCount {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" "); // split(" ") uses space as a delimiter

        System.out.println("Number of words = " + words.length);

    }

}