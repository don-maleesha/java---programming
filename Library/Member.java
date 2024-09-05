public class Member {
    
    String name;
    String address;
    int memberID;
    
    public Member(String name, String address, int memberID) {
        this.name = name;
        this.address = address;
        this.memberID = memberID;
    }

    public void Display() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
