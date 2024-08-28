import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        float salary = input.nextFloat();

        float HRA;
        float DA;
        float grossSalary;

        if (salary <= 10000) {

            HRA = salary * 0.2f;
            DA = salary * 0.8f;

            grossSalary = salary + HRA + DA;
            
        } else if ((salary > 10000) && (salary <= 20000)) {

            HRA = salary * 0.25f;
            DA = salary * 0.9f;

            grossSalary = salary + HRA + DA;

        } else {

            HRA = salary * 0.3f;
            DA = salary * 0.95f;

            grossSalary = salary + HRA + DA;

        }

        System.out.println("Gross Salary " + grossSalary);

    }
    
}