import java.util.Scanner;

public class Uppercase {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();


        System.out.println(sentence.toUpperCase());

        input.close();
    }
}