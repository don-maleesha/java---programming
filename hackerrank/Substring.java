import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");

        String s = input.nextLine();

        System.out.print("Enter the starting index: ");
        int start = input.nextInt();

        System.out.print("Enter the ending index: ");
        int end = input.nextInt();

        System.out.printf(s.substring(start, end));
        
    }
    
}
