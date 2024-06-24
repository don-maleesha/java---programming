import java.util.Scanner;

public class ToUpperCase {
    
    public static void main(String[] args) {
        
        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sentence.nextLine();

        String upperCase = " ";

        Scanner words = new Scanner(input);

        while (words.hasNext()) {

            String word = words.next();
            upperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";

        }

        System.out.println("Modified sentence: " + upperCase);
        
    }

}
