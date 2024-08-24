import java.util.Scanner;

public class AssignmentPrepTwo {
    
    public static void main(String[] args) {

        // Write your code here.
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter a word: ");
        String word  = sc.nextLine();

        System.out.println(word.toLowerCase());

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println(word.indexOf(ch));



        sc.close();


    }
}
