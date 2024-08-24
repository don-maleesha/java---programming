public class StringMethods {

    public static void main(String[] args) {

        // Declare and initialize a string variable 'str' with the value "dukeProgramming"
        String str = "dukeProgramming";

        // Extract a substring from 'str' starting from index 4 (inclusive) to index 12 (exclusive)
        String subStr = str.substring(4, 12);
        // Print the extracted substring "Program"
        System.out.println(subStr);

        // Extract a substring from 'str' starting from index 4 (inclusive) to index 7 (exclusive)
        // and print it. The output will be "Pro"
        System.out.println(str.substring(4, 7));

        // Find and print the index of the first occurrence of the substring "Pro" in 'str'
        // The output will be "Index of Pro = 4"
        System.out.println("Index of Pro = " + str.indexOf("Pro"));

        // Print the length of the string 'str'. The output will be "Length of the str = 15"
        System.out.println("Length of the str = " + str.length());

        // Find and print the index of the first occurrence of the character 'P' in 'str'
        // The output will be "Index of P = 4"
        System.out.println("Index of P = " + str.indexOf('P'));

        // Find and print the index of the first occurrence of the character 'g' in 'str'
        // The output will be 9
        System.out.println(str.indexOf("g"));

        // Find and print the index of the first occurrence of the character 'g' in 'str'
        // starting the search from index 10. The output will be 14
        System.out.println(str.indexOf("g", 10));

        // Find and print the index of the first occurrence of the character 'f' in 'str'
        // Since 'f' is not in the string, the output will be -1
        System.out.println(str.indexOf("f"));

        // Check if 'str' starts with the substring "duke" and print the result
        // The output will be true
        System.out.println(str.startsWith("duke"));

        // Check if 'str' ends with the substring "king" and print the result
        // The output will be true
        System.out.println(str.endsWith("king"));
    }
}
