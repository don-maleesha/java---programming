public class Room {
    
    private int roomNumber;
    private int tenantID;

    public Room(int roomNumber, int tenantID) {
        this.roomNumber = roomNumber;
        this.tenantID = tenantID;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

    public int getTenantID() {
        return tenantID;
    }
}
