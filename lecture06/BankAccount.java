class BankAccount {
    
    // Attributes
    String accountNumber;
    String accountHolder;
    double balance = 30000.500;

    // Constructor
    BankAccount(String accountNumberIn, String accountHolderIn) {
        
        this.accountNumber = accountNumberIn;
        this.accountHolder = accountHolderIn;
        this.balance = 0.0;
        
    }

    // 
    BankAccount(String accountHolderIn) {
        
        this.accountNumber = "000000000";
        this.accountHolder = "accountHolder";
        this.balance = 0.0;
        
        // use of this constructor is to create an account with a default account number
    }
    

// methods
    public void deposit(double amount) {
        
        this.balance += amount; // this keyword is used to refer to the current object
        
    }

    public boolean withdraw(double amount) {
        
        if(balance < amount) {

        return false;
        }

        this.balance -= amount;
        return  true;
        
        
    }

    public double checkBalance() {
            
        return this.balance; 
            
    }

// Getter and Setter methods

// Getter? Setter? What are those?
// Getter and Setter methods are used to access and modify the private attributes of a class.
// Getter methods are used to access the private attributes of a class.
// Setter methods are used to modify the private attributes of a class.
// Why do we need Getter and Setter methods?
// We need Getter and Setter methods to access and modify the private attributes of a class.
    public void setAccountHolderName(String accountHolderNameIn) {
        
        if(accountHolderNameIn.length() > 5) {

            this.accountHolder = accountHolderNameIn;

        }
        
    }

    public String getAccountHolderName() {
            
        return this.accountHolder;
            
    }

    public void setAccountNumber(String accountNumberIn) {
        
        if(accountNumberIn.length() == 9) {

            this.accountNumber = accountNumberIn;

        }
        
    }

    public String getAccountNumber() {
            
        return this.accountNumber;
            
    }

    

}
