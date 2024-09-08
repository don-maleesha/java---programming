import java.util.ArrayList;


public class Tenant {

    private int tenantID;
    private String name;
    private int roomNumber;

    ArrayList<Payment> paymentList = new ArrayList<Payment>();

    public Tenant(int tenantID, String name, int rommNumber) {
        this.tenantID = tenantID;
        this.name = name;
        this.roomNumber = rommNumber;
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


}