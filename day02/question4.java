

public class question4 {
    
    public static void main(String[] args) {
        
        float a = 20.5f;
        float b = 30.5f;

        if ((a > b) && (a < 100)) {

            System.out.println("Greate");

        } else if ((a > b) || (a < 100)) {

            System.err.println("Good");

        } else {

            System.out.println(a != 20);
        }

        // For the output from the AND operation to be true, both statements must be true.

        // For the output from the OR operation to be true, at least one statement must be true.

    }

}
