import java.util.*;
import java.math.BigDecimal;

public class BigDecimalSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] numbers = new String[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = input.next();
        }

        input.close();

        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a); // Sort in descending order
            }
        };

        Arrays.sort(numbers, comparator);

        // Print sorted array to verify
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
