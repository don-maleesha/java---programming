public class Payment {
    
    private int paymentId;
    private double amount;

    public Payment(int  paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
