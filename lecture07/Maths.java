public class Maths{


// static method: a method that belongs to the class, not to the object
    public static double pie = 3.14;

    public static double calculateArea(double radius){

        double area = pie * radius * radius;

        return area;
    }

    public static double power(double base, double exponent){

        double power = 1;

        int i;

        for(i=0; i<exponent; i++){

            power = base * power;

        }

        return power;
    }
}