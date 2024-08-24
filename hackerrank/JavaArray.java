import java.util.Scanner;

public class JavaArray {
    
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    System.out.println(n);

    int[] numbers = new int[n];



    for (int i = 0; i < numbers.length; i++) {

        numbers[i] = input.nextInt();

    }

    for (int i = 0; i < numbers.length; j++) {
        System.out.print(numbers[j] + " ");
    }
}
