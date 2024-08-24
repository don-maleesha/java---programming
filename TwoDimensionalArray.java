import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int[][] numbers = new int[6][6];

        for(int i = 0; i < 6; i++){

            String[] row = input.nextLine().split(" ");
            input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for(int j = 0; j < 6; j++){

                int arrayElement = Integer.parseInt(row[j]);
                numbers[i][j] = arrayElement;

            }
        }

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){

                int sum = numbers[i][j] + numbers[i][j + 1] + numbers[i][j + 2] + numbers[i + 1][j + 1] + numbers[i + 2][j] + numbers[i + 2][j + 1] + numbers[i + 2][j + 2];

                if(sum > maxSum){
                    maxSum = sum;
                }

            }

        }

        System.out.println(maxSum);
        input.close();
    }
    
}
