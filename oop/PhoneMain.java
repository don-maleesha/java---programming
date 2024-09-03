public class PhoneMain {
    
    public static void main(String[] args) {
         
        OldPhone oldPhone = new OldPhone("Nokia", "3310", 2000, 100.00);
        OldPhone oldPhone2 = new OldPhone("Samsung", "Galaxy S10", 2019, 1000.00);

        oldPhone.call();
        oldPhone2.call();

        NewPhone newPhone = new NewPhone("Apple", "iPhone 12", 2020, 1200.00);

        newPhone.call();
        newPhone.videoCall();
        newPhone.useMaps();

        Phone phone = new Phone("OnePlus", "8T", 2020, 800.00);

        phone.call();
        
    }
}
