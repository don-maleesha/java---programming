import java.util.Scanner;
public class leap{
    public static void main (String[] args){
        System.out.print("Enter the year: ");
        Scanner scn= new Scanner(System.in);
        int yr= scn.nextInt();

        if(((yr%4)==0) && ((yr%100)!=0) ){
            System.out.print("Leap year");
        }
        else if(((yr%400)==0) && ((yr%100)!=0)){
            System.out.print("Leap year");
        }
        else if(yr==2000){
            System.out.print("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}