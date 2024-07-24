import java.util.Scanner;

public class CheckAnagrams {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        String word1 = input.nextLine();
        word1 = word1.toLowerCase();

       
        String word2 = input.nextLine();
        word2 = word2.toLowerCase();

        if (word1.length() == word2.length()) {

            char[] array1 = new char[26];
            char[] array2 = new char[26];

            // Initialize the arrays
            for (int i = 0; i < word1.length(); i++) {
                array1[word1.charAt(i) - 'a']++; // Increment the count of the character at the index
                array2[word2.charAt(i) - 'a']++; // Increment the count of the character at the index
            }

            boolean anagrams = true; // Assume the words are anagrams

            // Compare the two arrays
            for (int i = 0; i < 26; i++) {

                // If the count of the characters at the same index are not equal
                if (array1[i] != array2[i]) {
                    anagrams = false;
                    break;
                }
            }

            if (anagrams) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }

        } else {
            System.out.println("Not Anagrams");
        }

        input.close();
    }
}
