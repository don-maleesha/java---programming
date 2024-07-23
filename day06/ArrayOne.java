import java.util.Scanner;

public class ArrayOne {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();

        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {

                max = numbers[i];

            }

        }

        System.out.println("Max: " + max);

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {

                min = numbers[i];

            }

        }

        System.out.println("Min: " + min);

        

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }

        System.out.println("Sum: " + sum);

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);

    }
}
