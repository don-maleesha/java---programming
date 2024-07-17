
public class SubstringComparison {
    



    public static String getSmallestAndLargest(String input, int string_length) {
        
        String current = input.substring(0, string_length);
        String smallest = current; // Initialize the smallest string
        String largest = current; // Initialize the largest string
        
        for(int i = 1; i <= input.length() - string_length; i++) {
            current = input.substring(i, i + string_length);

            if(current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if(current.compareTo(largest) > 0) {
                largest = current;
            }

        }
        


        return smallest + "\n" + largest;
    }

    
    
}
