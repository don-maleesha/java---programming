public class Room {
    
    private int roomNumber;
    boolean roomStatus = false;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomStatus(boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    public boolean getStatus(){
        return roomStatus;
    }

}
