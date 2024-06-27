import java.util.Scanner;

public class SubstringOfString {

    public static void main(String[] args) {
        
        Scanner word = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = word.nextLine();

        System.out.print("Enter the the substring to find: ");
        char sub = word.next().charAt(0);

        System.out.println("The substring is: " + input.indexOf(sub));
        
    }
    
}
