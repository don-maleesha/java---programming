import java.util.Scanner;

public class SwitchCaseGradeEvaluate {

    public static void main(String[] args) {
        
        Scanner grade = new Scanner(System.in);
        
        System.out.print("Enter the score: ");
        int marks = grade.nextInt();

        switch (marks) {
        
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                System.out.println("The grade is: A");
                break;
        
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                System.out.println("The grade is: B");
                break;
        
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                System.out.println("The grade is: C");
                break;

            case 60:
            case 61:   
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                System.out.println("The grade is: D");
                break;

            default:
                System.out.println("The grade is: F");
                break;
        
        }
    }
    
}
