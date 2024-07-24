import java.math.BigInteger;
import java.util.*;

public class BigInit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        
        BigInteger no1 = new BigInteger(input.next());
        BigInteger no2 = new BigInteger(input.next());
        
        System.out.println(no1.add(no2));
        System.out.println(no2.multiply(no2));
        
    }
}