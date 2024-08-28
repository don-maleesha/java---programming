public class CheckPro {

    public static void main(String[] args) {
        
        int i = 1;

        do { 
            System.out.println(i); 
            i++;

        } 
        
        while (i > 10);

        
        /*While Loop checks the condition before executing the loop's body. May not execute at all if the condition is false initially.Use when you want to execute the loop only if the condition is true from the start.*/

        /*Do-While Loop executes the loop's body at least once before checking the condition. Always executes at least once, regardless of the initial condition.Use when you want to ensure the loop's body is executed at least once, regardless of the initial condition.*/
    }

}