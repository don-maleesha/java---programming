public class StirngOperaions {
    
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Lochana";
        String str3; //Uninitialized string

        str3 = "Your are " + str2;

        System.out.println("Welcome: " + str3);

        System.out.println("Length of str3: " + str3.length());

        // what is substring? substring is a part of a string.
        System.out.println("Sub: " + str3.substring(0, 5)); // Substring from 0 to 5. 5 is exclusive.

        System.out.println("Str2 in uppercase: " + str2.toUpperCase());

    }

}
