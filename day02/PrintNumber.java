public class  PrintNumber {

    public static void main(String[] args) {
        
        int i = 0;

        while (i < 6) {

            System.out.println(i);
            i++;
            
        }

        i = 10;

        while (i > 0) {

            System.out.println(i);
            i--;
            
        }

        i = 10;
        
        do { 

            System.out.println(i);
            i--;

        } 
        
        while (i > 0);
    }
}