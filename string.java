public class string{
    public static void main(String[] args){
        String str1="Hello";
        String str2="Navindu";
        String str3;
        String str4="Navindu";
        System.out.println(str1+" "+ str2);
        str3="Welcome: " + str2;
        System.out.println(str3);
        System.out.println(str3.substring(0,5));
        System.out.println(str2.toUpperCase());
        boolean b;
        b=str1.equals(str2);
        System.out.println(b);
        System.out.println(str1.compareTo(str2));
        System.out.println(str4.compareTo(str2));
    }
}