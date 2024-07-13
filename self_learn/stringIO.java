

import java.util.Scanner;

public class StringIO {
    
    public static void main(String[] args){

        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sentence.nextLine();

        System.out.println("You entered: " + input);

    }
}
