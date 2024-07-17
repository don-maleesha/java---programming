public class MultiDIensionalArrays {
    
    public static void main(String[] args){

        int[][] numbers = new int[5][5];

        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers[i].length; j++){

                numbers[i][j] = i + j;

            }

        }

        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers[i].length; j++){

                System.out.print(numbers[i][j] + " ");

            }

            System.out.println();

        }

    }
    
}
