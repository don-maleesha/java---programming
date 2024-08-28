import java.util.Scanner;

public class CharFrequency {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String word = input.nextLine();

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        
        int freguency = 0;

        for(int i = 0; i < word.length(); i++){

        // If the character is found in the word, increment the frequency
        
            if(word.charAt(i) == ch){

                freguency++;

            }

        }

        System.out.println("Frequency of " + ch + " = " + freguency);
        input.close();

    }

}