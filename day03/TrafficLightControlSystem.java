
import java.util.Scanner;

public class TrafficLightControlSystem {
    
    public static void main(String[] args) {
        
        Scanner light = new Scanner(System.in);

        System.out.print("Enter the color of the traffic light: ");
        String input = light.nextLine();

        switch (input) {

            case "red":
            case "Red":
            case "RED":
                System.out.println("Stop");
                break;

            case "yellow":
            case "Yellow":
            case "YELLOW":
                System.out.println("Ready");
                break;

            case "green":
            case "Green":
            case "GREEN":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid color");
                break;

        }

    }

}
