import java.util.Scanner;
public class loop {
    public static void main(String[] args){
        while (true) { 
            System.out.print("Enter a number: ");
            Scanner scn= new Scanner(System.in);
            int no=scn.nextInt();
            if(no==1){
                System.out.println('X');
            }
            else if(no%2==0){
                System.out.println("Enter a odd number.");
            }
            else {
                for(int i=0;i<no;i++){
                    for(int j=0; j<no;j++){
                        if(i==j){
                            System.out.print("X ");
                        }
                        else if(i+j == no-1){
                            System.out.print("# ");
                        }
                        else{
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                }
            }
            System.out.print("\n");
        }

    }
    
}
