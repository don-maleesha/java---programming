/*
Task:
Given an integer, N, print its first 10 multiples. Each multiple  N * i(where 1 <= i <=10) should be printed on a new line in the form: N x i = result.
 */

/*
Output Format

Print 10 lines of output; each line  (where 1 <= i <=10) contains the  result of N * i in the form:
N x i = result.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class JavaLoops {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for (int i = 1; i <= 10; i++) {
            
            int result = N * i;
            
            System.out.println(N + " x " + i + " = " + result);

        }
        
    }
    
}
