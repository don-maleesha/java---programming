/*
Task:
Given an integer, n, perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/

/*Input Format

A single line containing a positive integer, .n
*/

import java.util.*;

public class JavaIfElse {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Declare and initialize the Scanner object
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (n % 2 != 0) {
            
            System.out.println("Weird");
            
        } else if ((n % 2 == 0) && ((n >= 2) && (n <= 5))) {
            
            System.out.println("Not Weird");
            
        } else if ((n % 2 == 0) && ((n >=6 ) && (n <= 20))) {
            
            System.out.println("Weird");
            
        } else {
            
            System.out.println("Not Weird");
            
        }

        scanner.close();
        
    }
    
}
