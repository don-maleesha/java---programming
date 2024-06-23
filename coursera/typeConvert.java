public class typeConvert {
    
    public static void main(String[] args) {

        int x = 3;
        double d = x; // implicit conversion: int x is automatically converted to double and assigned to d

        System.out.println("x: " + x); //  x: 3
        System.out.println("d: " + d); //  d: 3.0

        double d2 = 3.14;
        // int x2 = d2; // this line would cause a compilation error because you cannot implicitly convert a double to an int

        int x3 = (int) d2; // explicit conversion: cast double d2 to int, truncating the decimal part, and assign it to x3

        System.out.println("d2: " + d2); //  d2: 3.14
        System.out.println("x3: " + x3); //  x3: 3

        String s = "3";
        int x4 = Integer.parseInt(s); // explicit conversion: pasrse the string s to an integer and assign it to x4

        System.out.println("s: " + s); //  s: 3
        System.out.println("x4: " + x4); //  x4: 3

    }

}
