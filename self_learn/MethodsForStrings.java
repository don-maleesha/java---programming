public class MethodsForStrings {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Length of str1: " + str1.length()); // length() method returns the length of the string

        System.out.println("Convert to uppercase: " + str1.toUpperCase()); // toUpperCase() method converts the string to uppercase

        System.out.println(str1.concat(", ").concat(str2).concat("!")); // concat() method concatenates two strings

        System.out.println(str1.isEmpty()); // isEmpty() method returns true if the string is empty

        System.out.println(str1.replace("l", "t")); // replace() method replaces all occurrences of a character with another character

        System.out.println(str1.replaceFirst("e", "u")); // replaceFirst() method replaces the first occurrence of a character with another character

        System.out.println(str1.contains("hi0")); // substring() method returns a substring starting from the specified index
        
    }
    
}
