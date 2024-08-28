public class BankAccount {
    
    String accountNumber;
    String accountHolder;
    double balance;

    public void deposit() {

        System.out.println(accountHolder + " is depositing money");

    }

    public void withdraw() {

        System.out.println(accountHolder + " is withdrawing money");

    }

    public void checkBalance() {

        System.out.println(accountHolder + " is checking the balance");

    }


}
