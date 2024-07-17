import java.util.Scanner;

public class StrngsIntro {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        int n = a.length() + b.length();

        System.out.println(n);

       if (a.compareTo(b) > 0) {
           System.out.println("Yes");
       } else {
           System.out.println("No");
        
       }

         String aCap = a.substring(0, 1).toUpperCase() + a.substring(1); // Convert the first character to uppercase and append the rest of the word

            String bCap = b.substring(0, 1).toUpperCase() + b.substring(1); // Convert the first character to uppercase and append the rest of the word

            System.out.println(aCap + " " + bCap);
        
    }
}
