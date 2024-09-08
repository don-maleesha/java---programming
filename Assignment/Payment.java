public class Payment {
    
    private String month;
    private double amount;

    public Payment(String month, double amount) {
        this.month = month;
        this.amount = amount;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
