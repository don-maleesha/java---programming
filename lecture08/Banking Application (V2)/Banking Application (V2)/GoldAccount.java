public class GoldAccount extends BankAccount {
    
    private double overdraftLimit;

    public GoldAccount(String numberIn, String nameIn, double overdraft) {
        super(numberIn, nameIn);
        this.overdraftLimit = overdraftLimitIn;
    }

    @Override
    public boolean withdraw(double amountIn){
        if(amountIn > getBalance() + overdraftLimit){
            return false;
        } else {
            balance -= amountIn;
            return true;
        }
    }

    public void setOverDraftLimit(double overdraft)
}
