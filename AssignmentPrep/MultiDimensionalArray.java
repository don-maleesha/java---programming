import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();


        int[][] arr = new int[rows][columns];
        int[][] arr1 = new int[rows][columns];

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < columns; j++) {

                arr[i][j] = input.nextInt();

            }

        }

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < columns; j++) {

                arr1[i][j] = input.nextInt();

            }

        }

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < columns; j++) {

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();

        }

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < columns; j++) {

                System.out.print(arr1[i][j] + " ");

            }

            System.out.println();

        }

        int[][] sum = new int[rows][columns];

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < columns; j++) {

                sum[i][j] = arr[i][j] + arr1[i][j];

            }

        }

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < columns; j++) {

                System.out.print(sum[i][j] + " ");

            }

            System.out.println();

        }

        input.close();

    }
}