import java.util.Scanner;

public class VowelConsonantCount {
    
    public static void main(String[] args){

        Scanner word = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = word.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i); // Get the character at index i

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowels++;

            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                consonants++;

            }

        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }

}
