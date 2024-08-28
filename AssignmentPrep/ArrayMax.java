import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        
        int[] array = new int[n];

        for(int i = 0; i < n; i++){

            array[i] = input.nextInt();

        }

        int max = array[0];

        for(int i = 0; i < n; i++){

            if(array[i] > max){
                max = array[i];
            }

        }

        System.out.println("Max = " + max);
        input.close();
    }
}