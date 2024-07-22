import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the hour (1-12): ");
        int hour = input.nextInt();

        System.out.print("Enter the period (AM/PM): ");
        String period = input.next().toUpperCase();  // Using next() to read the string and converting it to uppercase

        switch (period) {
            case "AM":
                switch (hour) {
                    case 1:
                        System.out.println("01:00");
                        break;
                    case 2:
                        System.out.println("02:00");
                        break;
                    case 3:
                        System.out.println("03:00");
                        break;
                    case 4:
                        System.out.println("04:00");
                        break;
                    case 5:
                        System.out.println("05:00");
                        break;
                    case 6:
                        System.out.println("06:00");
                        break;
                    case 7:
                        System.out.println("07:00");
                        break;
                    case 8:
                        System.out.println("08:00");
                        break;
                    case 9:
                        System.out.println("09:00");
                        break;
                    case 10:
                        System.out.println("10:00");
                        break;
                    case 11:
                        System.out.println("11:00");
                        break;
                    case 12:
                        System.out.println("12:00");
                        break;
                    default:
                        System.out.println("Invalid hour");
                        break;
                }
                break;

            case "PM":
                switch (hour) {
                    case 1:
                        System.out.println("13:00");
                        break;
                    case 2:
                        System.out.println("14:00");
                        break;
                    case 3:
                        System.out.println("15:00");
                        break;
                    case 4:
                        System.out.println("16:00");
                        break;
                    case 5:
                        System.out.println("17:00");
                        break;
                    case 6:
                        System.out.println("18:00");
                        break;
                    case 7:
                        System.out.println("19:00");
                        break;
                    case 8:
                        System.out.println("20:00");
                        break;
                    case 9:
                        System.out.println("21:00");
                        break;
                    case 10:
                        System.out.println("22:00");
                        break;
                    case 11:
                        System.out.println("23:00");
                        break;
                    case 12:
                        System.out.println("00:00");
                        break;
                    default:
                        System.out.println("Invalid hour");
                        break;
                }
                break;

            default:
                System.out.println("Invalid period");
                break;
        }

        input.close();  // Closing the Scanner object
    }
}

