import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String result = " ";

        for(int i = 0; i < sentence.length(); i++) {
                    
            if (result.indexOf(sentence.charAt(i)) < 0) {
        
                // If the character is not in the result string, add it to the result
                result += sentence.charAt(i);
        
            }
        }

        input.close();

    }

}