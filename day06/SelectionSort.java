import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];  // Adjusted to size 10

        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();

        }

        // Selection Sort Implementation
        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minIndex]) {

                    minIndex = j;

                }
                
            }

            // Swap the found minimum element with the first element
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
