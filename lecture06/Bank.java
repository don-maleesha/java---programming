import java.util.ArrayList;

public class Bank {

    // List to store BankAcc objects (each representing a bank account)
    private ArrayList<BankAcc> bankAccsList = new ArrayList<>();

    // Method to search for an account by its number and return its index
    // Returns -999 if the account is not found
    private int search(String accountNumberIn){
        for (int i = 0; i < bankAccsList.size(); i++) {
            // Check if the account number matches the input
            if(bankAccsList.get(i).getAccNumber().equals(accountNumberIn)){
                return i; // Return the index if a match is found
            }
        }
        return -999; // Return -999 if no match is found
    }

    // Method to add a new bank account if it doesn't already exist
    public boolean addBankAccount(String bankAccountNumberIn, String accountHolderNameIn){
        // Check if the account number is already in the list
        if (search(bankAccountNumberIn) == -999){
            // Create a new BankAcc object with a default balance of 0.0
            BankAcc account = new BankAcc(bankAccountNumberIn, accountHolderNameIn, 0.0);
            bankAccsList.add(account); // Add the account to the list
            return true; // Return true indicating the account was added
        }
        return false; // Return false if the account already exists
    }

    // Method to remove a bank account if it exists
    public boolean removeBankAccount(String accountNumberIn){
        int index = search(accountNumberIn); // Search for the account
        if(index != -999){ // If account is found (index is not -999)
            bankAccsList.remove(index); // Remove the account at the found index
            return true; // Return true indicating the account was removed
        }
        return false; // Return false if the account was not found
    }

    // Method to deposit an amount into a bank account
    public boolean deposit(String accountNumberIn, double amountIn){
        BankAcc account = getBankAccount(accountNumberIn); // Retrieve the BankAcc object
        if(account != null){ // Check if the account exists
            account.deposit(amountIn); // Deposit the amount into the account
            return true; // Return true indicating the deposit was successful
        }
        return false; // Return false if the account was not found
    }

    // Helper method to get a BankAcc object by its account number
    private BankAcc getBankAccount(String accountNumberIn) {
        int index = search(accountNumberIn); // Search for the account
        if(index != -999) { // If account is found (index is not -999)
            return bankAccsList.get(index); // Return the BankAcc object
        }
        return null; // Return null if the account was not found
    }
}
