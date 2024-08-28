

public class Main {

    public static void main(String[] args) {

        // Create an object of DogExample
        DogExample Tommy = new DogExample(); // Tommy is an object of DogExample
        Tommy.name = "Tommy";

        DogExample Max = new DogExample(); // Max is an object of DogExample
        Max.name = "Max";

        Tommy.eat();
        Tommy.sleep();

        Student student = new Student();
        student.name = "Chenuka";

        student.learning();

        BankAccount account = new BankAccount();
        account.accountHolder = "Chenuka";
        account.deposit();
        account.withdraw();
        account.checkBalance();
        
    }
    
}
