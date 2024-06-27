

import java.util.Scanner;

public class NonRepeatingChar {

    public static void main(String[] args) {
        
        Scanner word = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = word.nextLine();

        for(int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            boolean isRepeating = false;

            for(int j = 0; j < input.length(); j++) {

                if(i != j && currentChar == input.charAt(j)) {

                    isRepeating = true;
                    break;

                }

            }

            if(!isRepeating) {

                System.out.println("The first non-repeating character is: " + currentChar);
                break;
                
            }
        }
    }

} 
