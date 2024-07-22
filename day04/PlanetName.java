import java.util.Scanner;

public class PlanetName {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the planet number (1-9): ");
        int planet = input.nextInt();

        switch (planet) {
            case 1:
                System.out.println("Mercury");
                break;
            case 2:
                System.out.println("Venus");
                break;
            case 3:
                System.out.println("Earth");
                break;
            case 4:
                System.out.println("Mars");
                break;
            case 5:
                System.out.println("Jupiter");
                break;
            case 6:
                System.out.println("Saturn");
                break;
            case 7:
                System.out.println("Uranus");
                break;
            case 8:
                System.out.println("Neptune");
                break;
            case 9:
                System.out.println("Pluto");
                break;
            default:
                System.out.println("Invalid planet number");
        }

    }
}
