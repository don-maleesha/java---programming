import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];  // Adjusted to size 10

        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();

        }

        // Bubble Sort Implementation
        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    // Swap the elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }

            }

        }

        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
}
