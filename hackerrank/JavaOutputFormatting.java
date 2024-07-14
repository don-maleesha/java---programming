/*
Input Format:

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from  0 to 999 .
 */

/*
Output Format:

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 */
import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("================================");

        for(int i=0;i<3;i++){

            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            
            System.out.printf("%-15s%03d%n", s1, x); // %03d means integer with 3 digits, %15s means string with 15 characters

        }

        System.out.println("================================");

    }
    
}

/*
Explanation

Each String is left-justified with trailing whitespace through the first  characters. 
The leading digit of the integer is the  16th character, and each integer that was less than  digits now has leading zeroes.

 */
