import java.util.Scanner;

public class ArrayAvg {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i <n; i++) {

            arr[i] = input.nextInt();

        }

        int sum = 0;

        for(int i = 0; i < n; i++) {

            sum = sum + arr[i];

        }

        double avg = sum / n;

        System.out.println("Average = " + avg);


    }
}