import java.util.Scanner;

public class AssignmentPrep {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Number of words: " + words.length);

        System.out.println(new StringBuilder(sentence).reverse().toString());

        for (int i = words.length - 1; i >= 0; i--) {

            System.out.print(words[i] + " "); 

        }

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i <= sentence.length() - 1; i++) {

            char ch = sentence.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowels++;

            } else {

                consonants++;
                
            }

        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        

    }
}
