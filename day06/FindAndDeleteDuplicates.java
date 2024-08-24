import java.util.Scanner;

public class FindAndDeleteDuplicates {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();

        }

        // Find and Delete Duplicates
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {

                    numbers[j] = 0;

                }

            }

        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
