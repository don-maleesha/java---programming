import java.util.ArrayList;


public class Tenant {

    private int tenantID;
    private String name;
    private int roomNumber;

    ArrayList<Payment> paymentList = new ArrayList<Payment>();

    public Tenant(int tenantID, String name, int roomNumber) {
        this.tenantID = tenantID;
        this.name = name;
        this.roomNumber = roomNumber;
    }

    //setter
    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

    //getter

    public int getTenantID() {
        return tenantID;
    }
    
    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void addPayment(Payment payment) {

        paymentList.add(payment);

    }

    public void displayPaymentHistory() {
        if (paymentList.isEmpty()) {
            System.out.println("No payment history for Tenant ID: " + tenantID);
        } else {
            System.out.println("Payment history for Tenant ID: " + tenantID);
            for (Payment payment : paymentList) {
                System.out.println("Month: " + payment.getMonth() + ", Amount: " + payment.getAmount());
            }
        }
    }

    public double calculateTotalPayment() {
        double total = 0;
        for (Payment payment : paymentList) {
            total += payment.getAmount();
        }
        return total;
    }

    public boolean hasPaidForMonth(String month) {
        for (Payment payment : paymentList) {
            if (payment.getMonth().equalsIgnoreCase(month)) {
                return true;
            }
        }
        return false;
    }


}