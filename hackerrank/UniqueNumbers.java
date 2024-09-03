import java.util.Scanner;

public class UniqueNumbers {

    public static void main(String[] args){

        int[] numbers = new int[5];

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int num = 0;
        int numValues = 0;
        boolean valid = true;

       

        while(numValues == numbers.length) {

            do {

                System.out.println("Enter a number: ");
                num = input.nextInt();

                for(int i = 0; i < numbers.length; i++){

                    if(numbers[i] == num){

                        valid = false;
                        break;

                    }

                } 
                
            } while (valid);

        }

        }
    }
