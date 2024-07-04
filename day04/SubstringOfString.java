import java.util.Scanner;

public class SubstringOfString {

    public static void main(String[] args) {
        
        Scanner word = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = word.nextLine();

        System.out.print("Enter the the substring to find: ");

        // Return the next character input from the user 
        char sub = word.next().charAt(0);

        // Find the index of the substring in the input string
        // If the character is not found, the indexOf method returns -1
        System.out.println("The substring is: " + input.indexOf(sub));
        
    }
    
}
