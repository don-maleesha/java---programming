import java.util.Scanner;

public class InputVariables {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean isTrue;
        byte ageOfUniverse;
        char grade;
        short temperature;
        int population;
        long distanceToSun;
        float massOfEarth;
        double massEarth;

        System.out.print("Enter a boolean value: ");
        isTrue = input.nextBoolean(); // nextBoolean() method reads a boolean value from the user

        System.out.print("Enter a byte value: ");
        ageOfUniverse = input.nextByte(); // nextByte() method reads a byte value from the user

        System.out.print("Enter a char value: ");
        grade = input.next().charAt(0); // next() method reads a string from the user and charAt(0) method returns the first character of the string

        System.out.print("Enter a short value: ");
        temperature = input.nextShort(); // nextShort() method reads a short value from the user

        System.out.print("Enter an int value: ");
        population = input.nextInt(); // nextInt() method reads an int value from the user

        System.out.print("Enter a long value: ");
        distanceToSun = input.nextLong(); // nextLong() method reads a long value from the user

        System.out.print("Enter a float value: ");
        massOfEarth = input.nextFloat(); // nextFloat() method reads a float value from the user


        System.out.print("Enter a double value: ");
        massEarth = input.nextDouble(); // nextDouble() method reads a double value from the user

        




    }
    
}
