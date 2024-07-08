import java.util.Scanner;
public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j=0;
        int num= 0;
        int numValues= 0;
        boolean valid= true;
        int[] numbers=new int[5];
        
        do { 
            System.out.print("Enter a number: ");
            num = in.nextInt();
            for(int i=0;i<numbers.length;i++){
                if(num==numbers[i]){
                    j++;
                }
            }
            if(j==0){
                numbers[numValues]=num;
                numValues++;
            }
            else{
                System.out.println("Enter a unique value.");
            }
            j=0;
            if (numValues==5) {
                valid= false;
            }
        } while (valid);
        System.out.println("\n");
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
    }
}
