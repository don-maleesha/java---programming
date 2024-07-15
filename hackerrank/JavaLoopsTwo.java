

import java.util.*;

class JavaLoopsTwo{

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // number of queries

        //for each query
        for(int i = 0; i < t; i++){

            //get values of a, b, and n
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            //for each value of n
            for(int j = 0; j < n; j++){
               
                //calculate a + b * 2^j
                a = a + b; 
                System.out.print(a + " "); //print the result

                //calculate b * 2^j
                b = b * 2;
                
            }
            
            System.out.println("");
            

        }

        in.close();

    }
    
}
