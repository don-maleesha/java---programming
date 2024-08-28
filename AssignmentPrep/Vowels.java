import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String string = input.nextLine();

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < string.length(); i++){

            char ch = string.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

                vowels++;

            } else {

                consonants++;

            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        input.close();
    }

}