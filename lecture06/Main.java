import java.util.ArrayList;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public double checkBalance() {
        return this.balance;
    }
}

public class Main {

    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("123456789", "Chenuka"); // acc1 is an object of BankAccount
        
        BankAccount acc2 = new BankAccount("987654321", "Navindu"); // acc2 is an object of BankAccount
        
        acc1.deposit(1000);
        acc2.withdraw(500);
        
        System.out.println("Balance of acc1: " + acc1.checkBalance());
        System.out.println("Balance of acc2: " + acc2.checkBalance());
        
        BankAccount[] accounts = new BankAccount[3]; // accounts is an array of BankAccount
        
        accounts[0] = acc1; // acc1 is an object of BankAccount
        accounts[1] = acc2; // acc2 is an object of BankAccount
        
        BankAccount acc3 = new BankAccount("112233445", "John Doe"); // acc3 is an object of BankAccount
        accounts[2] = acc3;
        
        accounts[0].deposit(1000);
        
        System.out.println("New balance of acc1: " + accounts[0].checkBalance()); // accounts[0].checkBalance() returns the balance of acc1
        
        // why do we need arrays?
        // Arrays are used to store multiple values of the same type.
        // ArrayLists are used to store multiple values of the same type.
        ArrayList<Integer> values = new ArrayList<>(); // values is an ArrayList of Integer
        values.add(10);
        values.add(20);
        
        values.remove(0);
        
        System.out.println("Size of values: " + values.size());
        System.out.println("First element in values: " + values.get(0));
        
        values.add(getAccountHolderName().length()); // Adding the length of the account holder name

        System.out.println("Size of values after adding account holder name length: " + values.size());
    }

    public static String getAccountHolderName() {
        return "John Doe";
    }
}
