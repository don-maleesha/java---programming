import java.util.Scanner;

public class AssignmentPrep {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentences: ");
        String s = input.nextLine();

        String[] words = s.split(" ");

        System.out.println("Number of words: " + words.length);

    }
}
