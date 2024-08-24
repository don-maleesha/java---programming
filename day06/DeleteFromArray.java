import java.util.Scanner;

public class DeleteFromArray {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();

        }

        System.out.println("Enter the number to delete: ");
        int numberToDelete = input.nextInt();

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == numberToDelete) {

                index = i;
                break;

            }

        }

        if (index == -1) {

            System.out.println("Number not found in the array.");

        } else {

            for (int i = index; i < numbers.length - 1; i++) {

                numbers[i] = numbers[i + 1];

            }

            numbers[numbers.length - 1] = 0;

            System.out.println("Array after deleting " + numberToDelete + ":");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

        }

    }
}
