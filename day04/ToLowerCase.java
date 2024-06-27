

// Write a program that reads a sentence and converts it to lowercase.

import java.util.Scanner;

public class ToLowerCase {

    public static void main(String[] args) {
        
        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sentence.nextLine();

        System.out.println("You entered: " + input.toLowerCase());
        
    }
    
}
