import java.util.  Scanner;
public class PercentageAndGrade {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks for Biology: ");
        int biology = input.nextInt();

        System.out.print("Enter marks for Mathematics: ");
        int mathematics = input.nextInt();

        System.out.print("Enter marks for Computer: ");
        int computer = input.nextInt();

        int total = physics + chemistry + biology + mathematics + computer;

        System.out.println("Total marks: " + total);

        double percentage = ((int) total / 500.0) * 100; // Type cast total to double to get the correct percentage

        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
