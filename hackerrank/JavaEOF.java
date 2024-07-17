import java.util.*;

public class JavaEOF {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int lineNumber = 1;

        while(input.hasNext()){

            System.out.println(lineNumber + " " + input.nextLine());
            lineNumber++;

        }

        input.close();

    }
    
}
