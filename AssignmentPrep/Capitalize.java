import java.util.Scanner;

public class Capitalize {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        String capitalized = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
            if (i > 0) {
                capitalized += " ";
            }
            capitalized += word;
        }

        System.out.println(capitalized);
    }
}
