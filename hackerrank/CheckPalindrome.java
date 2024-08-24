import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        word = word.toLowerCase();

        String reversed_word = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed_word)) {

            System.out.println("The word is a palindrome.");

        } else {

            System.out.println("The word is not a palindrome.");

        }

    }

}