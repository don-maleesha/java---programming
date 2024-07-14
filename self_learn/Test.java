public class Test {
    
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Hello";

        
        if (str1 == str2) {

            System.out.println("str1 and str2 are equal");

        } else {

            System.out.println("str1 and str2 are not equal");

        }

        /* 
          The reason str1 and str2 are equal is because they both have the same string value, which is "Hello". 
          
          In Java, when you create a string using double quotes, it is stored in a string pool. 
          
          When you assign the same string value to multiple variables, they will reference the same string object in the pool. 
          
          Therefore, comparing str1 and str2 using the == operator will return true.
          
        */

        String str3 = new String("Hello");

        if (str1 == str3) {

            System.out.println("str1 and str3 are equal");

        } else {

            System.out.println("str1 and str3 are not equal");

        }

        /* 
          The reason str1 and str3 are not equal is because str3 is created using the new keyword, which creates a new string object in the heap memory. 
          
          Therefore, str1 and str3 reference different string objects, even though they have the same string value. 
          
          Comparing str1 and str3 using the == operator will return false.
          
        */
    }

}
