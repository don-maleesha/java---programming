
/*
Task:
In this challenge, you must read  integers from stdin and then print them to stdout. 
Each integer must be printed on a new line.
*/

/*
Input Format:
There are 3 lines of input, and each line contains a single integer.
*/

import java.util.Scanner;

public class StdinAndStdout {

    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        int a = number.nextInt();

        int b = number.nextInt();

        int c = number.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        
    }
    
}
