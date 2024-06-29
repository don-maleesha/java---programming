public class StringMethods {
    
    public static void main(String[] args){

        String str = "dukeProgramming";

        
        String subStr = str.substring(4, 12);
        System.out.println(subStr);

        System.out.println(str.substring(4, 7));

        System.out.println("Index of Pro = " + str.indexOf("Pro"));

        System.out.println("Lenth of the str = " + str.length());

        System.out.println("Index of P = " + str.indexOf('P'));

        System.out.println(str.indexOf("g"));   

        System.out.println(str.indexOf("g", 10));

        System.out.println(str.indexOf("f"));

        System.out.println(str.startsWith("duke"));

        System.out.println(str.endsWith("king"));

    }
}
